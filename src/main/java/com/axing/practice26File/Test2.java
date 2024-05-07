package com.axing.practice26File;

import java.io.File;
import java.util.Objects;

public class Test2 {
    // 考虑子文件夹
    // 找到电脑中所有以avi结尾的电影。（需要考虑子文件夹）
    public static void main(String[] args) {
        File f = new File("/home/ax/Downloads/");
        System.out.println(findFormat(f));
    }

    public static int findFormat(File f){
        int n = 0;
        File[] files = f.listFiles();
        if(files == null) return 0;
        for (File file : files) {

            if(file.isFile() && file.getName().endsWith(".avi")){
                n++;
            }else if(file.listFiles() != null && 0 != file.listFiles().length) {
                n += findFormat(file);
            }
        }
        return n;
    }
}
