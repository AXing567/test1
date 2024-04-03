package com.axing.practice13String;

import java.util.StringJoiner;

/**
 * @projectName: test1
 * @package: com.axing.practice13String
 * @className: TestStringJoiner
 * @author: Axing
 * @description: TODO
 * @date: 2024/3/28 18:57
 * @version: 1.0
 */
public class TestStringJoiner {
    public static void main(String[] args) {
        // StringJoiner练习
        //StringJoiner共有两种构造方式，一种是三个参数：分别为间隔，开头，结尾。另一种为一个参数：间隔
        StringJoiner sj = new StringJoiner(", ", "[", "]");

        sj.add("abc").add("def").add("ghi");

        String str = sj.toString();
        System.out.println("StringJoiner的长度为：" + sj.length());
        System.out.println("拼接后的StringJoiner为：" + str);
    }
}
