package com.axing.practice13String;

import java.util.Random;

/**
 * @projectName: test1
 * @package: com.axing.practice13String
 * @className: Test5VerificationCode
 * @author: Axing
 * @description: 生成验证码
 * 内容：可以是小写字母，也可以是大写字母，还可以是数字
 * 规则：
 * 长度为5
 * 内容中是四位字母，1位数字。
 * 其中数字只有1位，但是可以出现在任意的位置。
 * @date: 2024/3/29 9:38
 * @version: 1.0
 */
public class Test5VerificationCode {
    public static void main(String[] args) {
        char[] word = {
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
        };

        // 生成验证码（有序
        Random rd = new Random();
        String vCode = "";
        vCode += word[rd.nextInt(word.length - 10)];
        vCode += word[rd.nextInt(word.length - 10)];
        vCode += word[rd.nextInt(word.length - 10)];
        vCode += word[rd.nextInt(word.length - 10)];
        vCode += word[rd.nextInt(word.length - 10)];
        vCode += word[rd.nextInt(word.length - 10, word.length)];

        // 打乱验证码
        char[] vCodeArr = vCode.toCharArray();
        int index1 = rd.nextInt(vCode.length());
        int index2 = vCode.length() - 1;
        char c1 = vCode.charAt(index1);
        char c2 = vCode.charAt(index2);
        vCodeArr[index1] = c2;
        vCodeArr[index2] = c1;
        vCode = new String(vCodeArr);


        System.out.println(vCode);


    }
}
