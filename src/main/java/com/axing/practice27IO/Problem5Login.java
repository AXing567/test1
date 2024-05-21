package com.axing.practice27IO;

import java.io.*;
import java.util.Scanner;

/**
 * @projectName: test1
 * @package: com.axing.practice27IO
 * @className: Problem5Login
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/10 上午10:55
 * @version: 1.0
 */
public class Problem5Login {
    public static void main(String[] args) throws IOException {
        // username=zhangsan&password=123&count=0
        // 判断用户输入的账号密码是否正确，连续输错三次则锁定账户
        File file = new File("E:\\IDEAProject\\test1\\src\\main\\java\\com\\axing\\practice27IO\\userinfo.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));


        // 读取本地数据
        String line = br.readLine();
        String[] param = line.split("&");
        String username = param[0].split("=")[1];
        String password = param[1].split("=")[1];
        int count = Integer.parseInt(param[2].split("=")[1]);


        // 用户键入账号密码
        System.out.println("请输入账号：");
        Scanner sc = new Scanner(System.in);
        String usernameNext = sc.next();
        System.out.println("请输入密码：");
        String passwordNext = sc.next();


        // 判断
        if (count < 2) {
            if (username.equals(usernameNext) && password.equals(passwordNext)) {
                // 如果账号密码正确且累计次数小于2     输出登录成功 清空count
                System.out.println("账号密码正确，欢迎登录！");
                count = 0;
            } else {
                // 如果账号密码错误且累计次数小于2     输出账号或密码错误
                System.out.println("账号或密码错误，请检查账号密码，您还有" + (2 - count) + "次机会");
                count++;
            }
        } else {
            // 累计次数大于等于2  输出账号已锁定
            System.out.println("已连续输入错误三次，账号密码已锁定");
        }


        // 写入新count
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        bw.write("username=" + username + "&password=" + password + "&count=" + count);


        // 关闭资源
        bw.close();

    }
}
