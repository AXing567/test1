package com.axing.practice13String;

/**
 * @projectName: test1
 * @package: com.axing.practice13String
 * @className: Test11
 * @author: Axing
 * @description: 给定字符串，由若干单词组成，前后有空格分隔，返回字符串中最后一个单词的长度
 * @date: 2024/3/29 11:30
 * @version: 1.0
 */
public class Test11 {
    public static void main(String[] args) {
        // 给定字符串
        String str = "Hello World";
        // 反转字符串（StringBuilder
        StringBuilder sb = new StringBuilder(str).reverse();
        // 遍历字符串，累加次数，遇到空格终止
        str = sb.toString();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ')
                break;
            sum ++;
        }
        System.out.println("最后一个单词的长度为：" + sum);
    }
}

