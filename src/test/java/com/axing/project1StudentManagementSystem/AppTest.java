package com.axing.project1StudentManagementSystem;


import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class AppTest {
    public static void main(String[] args) {
        // 从日记中获取 ## 行动指南  里所有的内容
        String s ="aaaa" +
                "## 行动指南" +
                "1. aaa" +
                "2. bbb" +
                "## 小结" +
                "1. aaa" +

                "## 行动指南" +
                "1. ccc" +
                "2. ddd";
        Pattern pattern = Pattern.compile("##\\s*行动指南\\s*((?:(?!##)[\\s\\S])*)");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
        test();
    }
    public static void test(){
        String s ="abc";
        Pattern compile = Pattern.compile("a(b)c");
        Matcher matcher = compile.matcher(s);
        while (matcher.find()){
            System.out.println(matcher.group());
            System.out.println(matcher.group());
        }

    }

}

