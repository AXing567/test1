package com.axing.practice13String;

import java.util.Scanner;

/**
 * @projectName: test1
 * @package: com.axing.practice13String
 * @className: Test7
 * @author: Axing
 * @description: 我国的居民身份证号码，由由十七位数字本体码和一位数字校验码组成。
 * 请定义方法判断用户输入的身份证号码是否合法，并在主方法中调用方法测试结果。
 * 规则为：号码为18位，不能以数字0开头，
 * 前17位只可以是数字，最后一位可以是数字或者大写字母X。
 * @date: 2024/3/29 10:51
 * @version: 1.0
 */
public class Test7 {
    public static void main(String[] args) {
        // 键入身份证号码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身份证号码：");
        String idNumber = sc.next();

        // 判断是否合法
        if (checkIDNumber(idNumber)) {
            System.out.println("身份证号码合法");
        } else {
            System.out.println("身份证号码不合法");
        }

    }

    public static boolean checkIDNumber(String str) {
        // 判断是否是18位
        if (str.length() != 18) return false;
        // 判断是否数字0作为开头
        if (str.charAt(0) == 0) return false;
        // 判断前17位是否是数字
        for (int i = 0; i < str.length() - 1; i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }

        // 判断最后一位是否是数字或者大写字母X
        char c = str.charAt(str.length() - 1);
        if (c < '0' || c > '9') {
            if (c != 'X') {
                return false;
            }
        }
        return true;
    }
}
