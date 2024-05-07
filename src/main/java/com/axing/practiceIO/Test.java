package com.axing.practiceIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("/home/ax/IdeaProjects/test1/aaa/ccc.txt");
        fos.write(97);
        fos.close();
    }
}
