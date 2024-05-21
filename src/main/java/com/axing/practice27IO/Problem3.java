package com.axing.practice27IO;

import java.io.*;

/**
 * @projectName: test1
 * @package: com.axing.practice27IO
 * @className: Problem3
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/8 下午5:00
 * @version: 1.0
 */
public class Problem3 {
    public static void main(String[] args) throws IOException {
        // 前三次运行本程序提示：欢迎您第x次使用本软件
        // 大于三次运行本程序提示:本程序是付费程序,您的免费次数已用完,请开通vip后重启本程序

        // 读取次数
        BufferedReader br = new BufferedReader(new FileReader("src/main/java/com/axing/practice27IO/count.txt"));
        int count = Integer.parseInt(br.readLine());
        // 判断并提示
        if (count++ < 3) {
            System.out.println("欢迎您第" + count + "次使用本软件");
        }else {
            System.out.println("本程序是付费程序,您的免费次数已用完,请开通vip后重启本程序");
        }
        // 写入次数
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/java/com/axing/practice27IO/count.txt"));
        bw.write(count + "");
        // 关流
        bw.close();
        br.close();

    }
}
