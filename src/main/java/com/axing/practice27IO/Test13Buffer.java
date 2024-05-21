package com.axing.practice27IO;

import java.io.*;

/**
 * @projectName: test1
 * @package: com.axing.practice27IO
 * @className: Test13Buffer
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/8 上午10:38
 * @version: 1.0
 */
public class Test13Buffer {
    public static void main(String[] args) throws IOException {
        // 字符缓冲输入输出流的练习
        BufferedReader br = new BufferedReader(new FileReader("E:\\IDEAProject\\test1\\aaa\\chinese.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\IDEAProject\\test1\\aaa\\chinese2.txt"));

//        int len ;
//        char[] chars = new char[1024];
//        while ((len = br.read(chars)) != -1){
//            bw.write(chars,0,len);
//        }

        String line;
        while((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
