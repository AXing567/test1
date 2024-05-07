package com.axing.practiceIO;

import java.io.*;

public class Test4Copy {
    public static void main(String[] args) throws IOException {
        // 文件拷贝
        FileInputStream fis = new FileInputStream(new File("/home/ax/Documents/关新星简历2(1).pdf"));
        FileOutputStream fos = new FileOutputStream(new File("/home/ax/IdeaProjects/test1/aaa/ddd.pdf"));
        long begin = System.currentTimeMillis();
        int b;
        while ((b = fis.read()) != -1){
            fos.write(b);
        }
        long end = System.currentTimeMillis();
        fos.close();
        fis.close();
        System.out.println(end - begin);
    }
}
