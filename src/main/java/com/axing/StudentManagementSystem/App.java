package com.axing.StudentManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @projectName: test1
 * @package: com.axing.StudentManagementSystem
 * @className: App
 * @author: Axing
 * @description: TODO
 * @date: 2024/4/2 11:02
 * @version: 1.0
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作1登录 2注册 3忘记密码");
            String choice = sc.next();
            switch (choice) {
                case "1" -> login(users);
                case "2" -> register(users);
                case "3" -> forgetPwd(users);
                default -> System.out.println("输入错误，请重新输入。");
            }
        }
    }

    private static void login(ArrayList<User> users) {
        String id;
        String pwd;
        String VerificationCode;
//        键入用户名

//        如果未注册则提示：用户名未注册，请先注册

//        键入密码

//        键入验证码
//        先判断验证码

//        再判断用户名和密码是否正确，有三次机会

    }

    private static void register(ArrayList<User> users) {
        System.out.println("注册用户：");
        Scanner sc = new Scanner(System.in);
        String id;
        String pwd;
        String idNumber;
        String phoneNumber;
        // 键入用户名
        while (true) {
            System.out.println("请输入用户名（3-15位，不能全是数字）");
            id = sc.next();
            // 校验用户名 合规继续  反之重新键入
            if (checkId(users, id)) {
                break;
            }
            System.out.println("格式不正确，请重新输入。");
        }
        // 键入密码
        while (true) {
            System.out.println("请输入密码：");
            pwd = sc.next();
            // 校验密码 合规继续  反之重新键入
            System.out.println("请再次输入密码：");
            String pwd2 = sc.next();
            if (pwd.equals(pwd2)) {
                break;
            }
            System.out.println("两次密码不一致，请重新输入。");


        }


        // 键入身份证号
        while (true) {
            System.out.println("请输入身份证号码：");
            idNumber = sc.next();
            // 校验身份证号 合规继续  反之重新键入
            if (checkIdNumber(idNumber)) {
                break;
            }
            System.out.println("身份证号码格式有误，请重新输入。");
        }
        while (true) {
            // 键入手机号
            System.out.println("请输入手机号码：");
            phoneNumber = sc.next();
            // 校验手机号 合规继续  反之重新键入
            if (checkPhoneNumber(phoneNumber)) {
                break;
            }
            System.out.println("手机号码格式有误，请重新输入。");
        }
        System.out.println("注册成功！");

    }

    public static boolean checkPhoneNumber(String phoneNumber) {
//        长度是否为11位
        if (phoneNumber.length() != 11) return false;
//        不能以0开头
        if (phoneNumber.charAt(0) == '0') return false;
//        必须都是数字
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if (c < '0' || c > '9') return false;
        }
        return true;

    }

    public static boolean checkIdNumber(String idNumber) {
//        判断长度是否为18位
        if (idNumber.length() != 18) return false;
//        不能以0开头
        if (idNumber.charAt(0) == '0') return false;
//        前17位必须都是数字
        for (int i = 0; i < idNumber.length() - 1; i++) {
            char c = idNumber.charAt(i);
            if (c < '0' || c > '9') return false;
        }
//        最后一位可以是数字也可以是大写或小写x
        char c = idNumber.charAt(idNumber.length() - 1);
        if (c != 'x' && c != 'X') {
            if (c < '0' || c > '9')
                return false;
        }
        return true;
    }

    public static boolean checkId(ArrayList<User> users, String id) {
        // 校验用户名是否唯一
        if (contains(users, id)) {
            return false;
        }

//        检查用户名长度是否在3-15位之间
        if (id.length() < 3 || id.length() > 15) {
            return false;
        }
//        检查是否是数字及字母的组合(不能是纯数字）
        int wordNum = 0;
        int num = 0;

        for (int i = 0; i < id.length(); i++) {
            char c = id.charAt(i);
            // 数字个数
            if (c >= '0' && c <= '9') {
                num++;
            }
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                wordNum++;
            }
        }
//        判断数字的个数和字母的个数是否合理
//        如果字母和数字的数量不等于总长度 错的
        if (wordNum + num != id.length()) {
            return false;
        } else if (wordNum == 0) {
//            如果是纯数字 错的
            return false;
        }
        return true;
    }

    public static boolean contains(ArrayList<User> users, String id) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(id))
                return true;
        }
        return false;
    }

    private static void forgetPwd(ArrayList<User> users) {
    }


}

