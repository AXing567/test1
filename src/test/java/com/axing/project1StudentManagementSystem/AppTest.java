package com.axing.project1StudentManagementSystem;


import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class AppTest {
    public static void main(String[] args) throws IOException {

        // 从日记中获取 ## 行动指南  里所有的内容
/*        String s ="aaaa" +
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
        }*/

        diaryFilter();
    }

    public static void diaryFilter() throws IOException {
        long begin = System.currentTimeMillis();
        // 导入文件
        File diary = new File("E:\\IDEAProject\\test1\\aaa\\1_日记.md");
        File target = new File("E:\\IDEAProject\\test1\\aaa\\diaryTarget.md");
        // 过滤文件内容
        BufferedReader br = new BufferedReader(new FileReader(diary));
        BufferedWriter bw = new BufferedWriter(new FileWriter(target));
        Pattern compile = Pattern.compile("##\\s*行动指南\\s*((?:\\d+\\.\\s+.+\\n*)+)");
        StringBuilder sb = new StringBuilder();
        int c;
        while ((c = br.read()) != -1) {
            sb.append((char) c);
        }
        Matcher matcher = compile.matcher(sb.toString());

        // 遍历追加到新的文件中
        while (matcher.find()) {
            bw.write(matcher.group());
            System.out.println(matcher.group());
        }
        // 关闭流
        bw.close();
        br.close();
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }

}

