package com.axing.practiceIO;

import java.io.UnsupportedEncodingException;

public class Test6 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // String与byte数组之间，带编码的转换
        String s0 = "aa哈哈哈";
        // 默认使用utf8的编码格式
        byte[] b1UTF8 = s0.getBytes();
        // 指定编码格式
        byte[] b2GBK = s0.getBytes("GBK");

        // 默认解码方式UTF8
        String s1 = new String(b1UTF8);
        // 指定解码方式
        String s2 = new String(b2GBK,"GBK");

        System.out.println(s1);
        System.out.println(s2);




    }
}
