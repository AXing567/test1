package com.axing.practice27IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("/home/ax/IdeaProjects/test1/aaa/ccc.txt",true);
        // 换行和追加的练习

        String s1 = "hahahahaha";
        String s2 = "heiheiheihei";
        fos.write(s1.getBytes());
        fos.write("\n".getBytes());
        fos.write(s2.getBytes());
        fos.close();

    }
}
