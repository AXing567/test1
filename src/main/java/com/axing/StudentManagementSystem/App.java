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
        System.out.println("欢迎来到学生管理系统");
        System.out.println("请选择操作1登录 2注册 3忘记密码");
        Scanner sc = new Scanner(System.in);
        String choice = sc.next();
        ArrayList<User> users = new ArrayList<>();
        while (true) {
            switch (choice) {
                case "1" -> login(users);
                case "2" -> register(users);
                case "3" -> forgetPwd(users);
                default -> System.out.println("输入错误，请重新输入。");
            }
        }
    }

    private static void login(ArrayList<User> users) {
    }

    private static void register(ArrayList<User> users) {
        System.out.println("注册用户：");
        Scanner sc = new Scanner(System.in);
        while (true) {
            // 键入用户名
            String id = sc.next();
            // 校验用户名 合规继续  反之重新键入
            if (checkName(users, id)) {
                break;
            }
        }
        // 键入密码
        String pwd = sc.next();

        // 校验密码 合规继续  反之重新键入

        // 键入身份证号
        String idNumber = sc.next();

        // 校验身份证号 合规继续  反之重新键入

        // 键入手机号
        String phoneNumber = sc.next();

        // 校验手机号 合规继续  反之重新键入


    }

    private static boolean checkName(ArrayList<User> users, String id) {
        // 校验用户名是否唯一
        if(contains(users,id)){

        }
//        检查用户名长度是否在3-15位之间

//        检查是否是数字及字母的组合

    }

    private static void forgetPwd(ArrayList<User> users) {
    }


}

