package com.axing.practice27IO;

import java.io.FileReader;
import java.io.IOException;

public class Test7 {
    public static void main(String[] args) throws IOException {
        // 文件字符输入流的读取练习
        try (FileReader fr = new FileReader("/home/ax/IdeaProjects/test1/aaa/chinese.txt")) {
            int c;
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
        }
        try (FileReader fr2 = new FileReader("/home/ax/IdeaProjects/test1/aaa/chinese.txt")) {
            char[] chars = new char[2];
            int len;
            while ((len = fr2.read(chars)) != -1){
                System.out.print(new String(chars,0,len));
            }
        }

    }
}
