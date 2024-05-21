package com.axing.practice27IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test5CopyByBuffer {
    public static void main(String[] args) throws IOException {
        //  加缓存复制，通常用5mb  1024*1024*5
        long begin = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream(new File("/home/ax/Documents/关新星简历2(1).pdf"));
        FileOutputStream fos = new FileOutputStream(new File("/home/ax/IdeaProjects/test1/aaa/ddd.pdf"));
        byte[] bytes = new byte[1024 * 1024 * 5];
        int len;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        fos.close();
        fis.close();
        long end = System.currentTimeMillis();
        System.out.println(end - begin);

    }
}
