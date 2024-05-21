package com.axing.practice27IO;

import java.io.FileWriter;
import java.io.IOException;

public class Test9 {
    public static void main(String[] args) throws IOException {
        // 字符流写入练习,刷新、缓冲区满以及关闭流会将缓冲区的内容写入到文件中，这里用到的是刷新
        FileWriter fw = new FileWriter("/home/ax/IdeaProjects/test1/aaa/chinese.txt", true);
        fw.write("哈哈哈哈哈");
        fw.flush();
        fw.write("嘿嘿嘿嘿");



    }
}
