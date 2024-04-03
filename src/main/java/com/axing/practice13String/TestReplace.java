package com.axing.practice13String;

/**
 * @projectName: test1
 * @package: com.axing.practice13String
 * @className: TestReplace
 * @author: Axing
 * @description: 字符串替换练习
 * @date: 2024/3/28 18:17
 * @version: 1.0
 */
public class TestReplace {
    public static void main(String[] args) {
        String[] arr = {"TMD","CNM"};
        String talk = "aaaaTMD,CNM";
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i],"***");
        }
        System.out.println("替换后的为：");
        System.out.println(talk);
    }
}
