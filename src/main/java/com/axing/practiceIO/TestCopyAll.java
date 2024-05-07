package com.axing.practiceIO;

import java.io.*;

public class TestCopyAll {
    public static void main(String[] args) throws IOException {
        File source = new File("/home/ax/IdeaProjects/test1/aaa");
        File dest = new File("/home/ax/IdeaProjects/test1/aab");
        copy(source, dest);

    }

    public static void copy(File source, File dest) throws IOException {
        dest.mkdir();
        File[] files = source.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(dest, file.getName()));
                int len;
                byte[] bytes = new byte[1024];
                while ((len = fis.read()) != -1) {
                    fos.write(bytes, 0, len);
                }
                fos.close();
                fis.close();
            } else {
                copy(file, new File(dest, file.getName()));

            }
        }

    }
}
