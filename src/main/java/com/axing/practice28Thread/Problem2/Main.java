package com.axing.practice28Thread.Problem2;

/**
 * @projectName: test1
 * @package: com.axing.practice28Thread.Problem2
 * @className: Main
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/16 上午9:51
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        GiveGift g = new GiveGift();
        Thread t1 = new Thread(g);
        Thread t2 = new Thread(g);

        t1.setName("张三");
        t2.setName("李四");

        t1.start();
        t2.start();
    }
}
