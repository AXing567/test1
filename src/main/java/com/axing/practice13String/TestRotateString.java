package com.axing.practice13String;

/**
 * @projectName: test1
 * @package: com.axing.practice13String
 * @className: TestRotateString
 * @author: Axing
 * @description: TODO
 * @date: 2024/3/29 9:09
 * @version: 1.0
 */
public class TestRotateString {
    public static void main(String[] args) {
        // 定义两个字符串
        String s1 = "abcde";
        String s2 = "cdeabd";
        boolean flag = false;
        // 旋转字符串
        for (int i = 0; i < s1.length(); i++) {
            if (s1.equals(s2)) {
                flag = true;
                break;
            }
            s1 = rotate(s1);
        }
        if (flag) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

    public static String rotate(String str) {
        char first = str.charAt(0);
        String end = str.substring(1, str.length());
        return end + first;

    }
}
