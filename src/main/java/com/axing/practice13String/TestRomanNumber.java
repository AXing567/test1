package com.axing.practice13String;

import java.util.Scanner;

/**
 * @projectName: test1
 * @package: com.axing.practice13String
 * @className: TestRomanNumber
 * @author: Axing
 * @description: TODO
 * @date: 2024/3/28 20:33
 * @version: 1.0
 */
public class TestRomanNumber {
    public static void main(String[] args) {
        // 键入一个字符串
        Scanner sc = new Scanner(System.in);
        String str;
        String result;
        while (true) {
            str = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            // 判定字符串是否合规
            if (checkNumber(str)) {
                // 将字符串数值转换为罗马数字
                for (int i = 0; i < str.length(); i++) {
                    sb.append(strToRomanNumber2(str.charAt(i)));
                }
                result = sb.toString();
                System.out.println(result);
                break;
            } else {
                System.out.println("不是罗马数字，请重新输入");
            }
        }
    }

    /**
     * @param str:
     * @return String
     * @author Axing
     * @description 查找表的方式实现
     * @date 2024/3/28 20:53
     */
    public static String strToRomanNumber(char str) {
        String[] rm = {"", "Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ",};
        return rm[str - '0'];
    }

    /**
     * @param str:
     * @return String
     * @author Axing
     * @description switch新特性，新用法
     * @date 2024/3/28 20:53
     */
    public static String strToRomanNumber2(char str) {
        String result;
        result = switch (str - '0') {
            case 0 -> "";
            case 1 -> "Ⅰ";
            case 2 -> "Ⅱ";
            case 3 -> "Ⅲ";
            case 4 -> "Ⅳ";
            case 5 -> "Ⅴ";
            case 6 -> "Ⅵ";
            case 7 -> "Ⅶ";
            case 8 -> "Ⅷ";
            case 9 -> "Ⅸ";
            default -> "";
        };
        return result;
    }

    /**
     * @param str:
     * @return boolean
     * @author Axing
     * @description 检查字符串中是否存在非数字以及长度是否大于9
     * @date 2024/3/28 20:54
     */
    public static boolean checkNumber(String str) {
        // 判定长度
        if (str.length() > 9) {
            return false;
        }
        // 检查是否有非数字
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }
}
