package com.axing.practice26File;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException, IOException {
        File file = new File("/home/ax/IdeaProjects/test1/aaa/bbb.md");
        String name = file.getName();
        System.out.println(" file.getName():" + name);

        System.out.println("file.isDirectory():" + file.isDirectory());
        System.out.println("file.isFile():" + file.isFile());
        System.out.println("file.exists():" + file.exists());
        System.out.println("file.length():" + file.length());
        System.out.println("file.getAbsoluteFile():" + file.getAbsoluteFile());
        System.out.println("file.getPath():" + file.getPath());
        System.out.println("file.getName():" + file.getName());
        System.out.println("file.lastModified():" + file.lastModified());
        Date date = new Date(file.lastModified());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时：mm分：ss秒");
        System.out.println(sdf.format(date));

        System.out.println("file.createNewFile():" + file.createNewFile());
        System.out.println("file.mkdir():" + file.mkdir());
        System.out.println("file.mkdirs():" + file.mkdirs());
//        System.out.println("file.delete():" + file.delete());

    }
}
