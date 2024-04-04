package com.axing.StudentManagementSystem;

import java.util.ArrayList;
import java.util.Random;
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
        loop:
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作1登录 2注册 3忘记密码 4退出");
            String choice = sc.next();
            switch (choice) {
                case "1" -> login(users);
                case "2" -> register(users);
                case "3" -> forgetPwd(users);
                case "4" -> {
                    break loop;
                }
                default -> System.out.println("输入错误，请重新输入。");
            }
        }
    }

    private static void login(ArrayList<User> users) {
        String id;
        String pwd;
        String verificationCode;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
//        键入用户名
            System.out.println("请输入用户名：");
            id = sc.next();
//        如果未注册则提示：用户名未注册，请先注册
            int index = indexId(users, id);
            if (index < 0) {
                System.out.println(id + "未注册，请先注册。");
                return;
            }
//        键入密码
            System.out.println("请输入密码：");
            pwd = sc.next();
            while (true) {
//        键入验证码
                String vc = verificationCode();
                System.out.println("Verification code is：" + vc);
                verificationCode = sc.next();
//        先判断验证码
                if (verificationCode.equalsIgnoreCase(vc)) break;
                System.out.println("验证码错误，请重新输入验证码");
            }
//        再判断用户名和密码是否正确，有三次机会
            if (users.get(index).getPwd().equals(pwd)) {
                // 登陆成功
                System.out.println("密码正确，登陆成功");
                StudentSystem.main(null);
                break;
            }
            System.out.println("密码错误，请重新输入");
        }

    }

    /**
     * @return String
     * @author ax
     * @description 验证码长度位5, 四位大写或者小写字母及一位数字组成，字母可重复
     * @date 2024/4/4 下午9:40
     */
    public static String verificationCode() {

//        建立字符库
        StringBuilder sb = new StringBuilder();
        for (char i = 'a'; i <= 'z'; i++) {
            sb.append(i);
        }
        for (char i = 'A'; i <= 'Z'; i++) {
            sb.append(i);
        }
        for (char i = '0'; i <= '9'; i++) {
            sb.append(i);
        }
        char[] word = sb.toString().toCharArray();
//        清空StringBuilder
        sb.delete(0, sb.length());
//        追加验证码到StringBuilder
        Random rd = new Random();
        for (int i = 0; i < 4; i++) {
//            添加字母
            sb.append(word[rd.nextInt(word.length - 10)]);
        }
//        添加数字
        sb.append(word[rd.nextInt(word.length - 10, word.length)]);
//        打乱数字和字母的顺序
        word = sb.toString().toCharArray();
        int index = rd.nextInt(4);
        char c = word[index];
        word[index] = word[4];
        word[4] = c;
//        返回验证码
        return new String(word);

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
        users.add(new User(id, pwd, idNumber, phoneNumber));
        System.out.println("注册成功！");

    }

    private static void forgetPwd(ArrayList<User> users) {
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
            return c >= '0' && c <= '9';
        }
        return true;
    }

    public static boolean checkId(ArrayList<User> users, String id) {
        // 校验用户名是否唯一
        if (containsId(users, id)) {
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

    public static boolean containsId(ArrayList<User> users, String id) {
        return indexId(users, id) >= 0;
    }

    public static int indexId(ArrayList<User> users, String id) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(id)) return i;
        }
        return -1;
    }


}

