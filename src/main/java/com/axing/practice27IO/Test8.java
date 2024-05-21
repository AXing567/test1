package com.axing.practice27IO;

import java.io.FileWriter;
import java.io.IOException;

public class Test8 {
    public static void main(String[] args) throws IOException {
        // 字符输出流的练习
        FileWriter fw = new FileWriter("/home/ax/IdeaProjects/test1/aaa/chinese.txt",true);
//        fw.write(8888888);
//        fw.write("你好世界！");
//        fw.write("你好世界！",0,2);
        char[] chars = {'你','好','世','界'};
        fw.write(chars,0,2);
        fw.close();
    }
}
