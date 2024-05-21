package com.axing.practice13String;

import java.util.Scanner;

/**
 * @projectName: test1
 * @package: com.axing.practice13String
 * @className: Test2Runnable
 * @author: Axing
 * @description: 键盘录入一个字符串，使用程序实现在控制台遍历该字符串
 * @date: 2024/3/28 8:34
 * @version: 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        String str = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        str = sc.next();

        System.out.println("拆分输出字符串");
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
