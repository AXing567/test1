package com.axing.practice13String;

import java.util.Scanner;

/**
 * @projectName: test1
 * @package: com.axing.practice13String
 * @className: Test
 * @author: Axing
 * @description: 已知用户名和密码，请用程序实现模拟用户登录。总共给三次机会，登录之后，给出相应的提示
 * @date: 2024/3/28 8:28
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        String username = "axing";
        String password = "123";

        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入用户名：");
            String u = sc.next();
            System.out.println("请输入密码：");
            String p = sc.next();
            if (u.equals(username) && p.equals(password)) {
                System.out.println("登录成功！");
                break;
            } else {
                System.out.println("登录失败！账号或密码错误！（失败三次后锁定账户，请联系客服）");
                System.out.println("还剩" + (3 - i) + "次机会");
                if(3 - i == 0){
                    System.out.println("账户已锁定");
                }
            }
        }
    }
}
