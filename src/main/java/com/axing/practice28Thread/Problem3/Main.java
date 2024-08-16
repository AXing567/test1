package com.axing.practice28Thread.Problem3;

/**
 * @projectName: test1
 * @package: com.axing.practice28Thread.Problem3
 * @className: Server
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/16 上午9:58
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Number number = new Number();
        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}
