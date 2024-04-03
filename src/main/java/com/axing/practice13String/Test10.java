package com.axing.practice13String;

/**
 * @projectName: test1
 * @package: com.axing.practice13String
 * @className: Test10
 * @author: Axing
 * @description: 给定两个字符串形式的非负整数，返回他们的乘积，返回值用字符串的形式
 * @date: 2024/3/29 11:23
 * @version: 1.0
 */
public class Test10 {
    public static void main(String[] args) {
        // 调用方法实现要求并输出
        System.out.println(strProduct("5", "10"));

    }
    public static String strProduct(String num1,String num2){
        // 字符串变成数值
        // 循环遍历取出字符并转换为数值
        // 定义数值接收字符变数值的结果
        // 将数值*10+新数值  反复循环得到转换后的结果

        int n1 = 0;
        int n2 = 0;
        for (int i = 0; i < num1.length(); i++) {
            n1 = n1 * 10 + (num1.charAt(i) - '0');
        }
        for (int i = 0; i < num2.length(); i++) {
            n2 = n2 * 10 + (num2.charAt(i) - '0');
        }
        return (n1 * n2) + "";

    }
}
