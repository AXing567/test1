package com.axing.practice27IO;

import java.io.*;

/**
 * @projectName: test1
 * @package: com.axing.practice27IO
 * @className: Test15
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/8 下午7:47
 * @version: 1.0
 */
public class Test15 {

    public static void main(String[] args) throws IOException {
        // 用字节流读取一行数据
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(
                "E:\\IDEAProject\\test1\\src\\main\\java\\com\\axing\\practice27IO\\GBKtxt.txt"),"GBK"));
        String line = br.readLine();
        System.out.println(line);

    }
}
