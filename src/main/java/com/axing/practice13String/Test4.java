package com.axing.practice13String;

import java.util.Random;
import java.util.Scanner;

/**
 * @projectName: test1
 * @package: com.axing.practice13String
 * @className: Test4Server
 * @author: Axing
 * @description: 键盘输入任意字符串，打乱里面的内容
 * @date: 2024/3/29 9:28
 * @version: 1.0
 */
public class Test4 {
    public static void main(String[] args) {
        // 键入字符串
        System.out.println("请输入字符串");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();

        // 打乱
        // 生成随机两个下标
        Random rd = new Random();
        for (int i = 0; i < s.length(); i++) {
            int index1 = rd.nextInt(s.length());
            int index2 = rd.nextInt(s.length());
            char t1 = arr[index1];
            char t2 = arr[index2];
            // 交换两个下标的值
            arr[index1] = t2;
            arr[index2] = t1;
        }

        s = new String(arr);
        System.out.println("打乱后：");
        System.out.println(s);


    }
}
