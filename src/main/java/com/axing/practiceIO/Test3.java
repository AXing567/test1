package com.axing.practiceIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/home/ax/IdeaProjects/test1/aaa/ccc.txt");
        int b;
        while ((b = fis.read()) != -1) {
            System.out.print((char) b);
        }
        fis.close();

    }
}
