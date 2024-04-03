package com.axing.practice13String;

import java.util.Scanner;

/**
 * @projectName: test1
 * @package: com.axing.practice13String
 * @className: Test6
 * @author: Axing
 * @description: 请编写程序，由键盘录入一个字符串，统计字符串中英文字母和数字分别有多少个。比如：Hello12345World中字母：10个，数字：5个。
 * @date: 2024/3/29 10:46
 * @version: 1.0
 */
public class Test6 {
    public static void main(String[] args) {
        // 录入字符串
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        // 统计中英文字母
        int num = 0;
        int word = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= '0' && c <= '9'){
                num++;
            }else if(c >= 'a' && c <= 'z'){
                word++;
            }else if(c >= 'A' && c <= 'Z'){
                word++;
            }
        }

        // 输出中英文字母个数
        System.out.println("数字的个数：");
        System.out.println(num);
        System.out.println("字母的个数：");
        System.out.println(word);
    }
}
