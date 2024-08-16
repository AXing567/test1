package com.axing.practice28Thread.Test6waitAndNotify;

/**
 * @projectName: test1
 * @package: com.axing.practice28Thread.Test6waitAndNotify
 * @className: Server
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/15 上午11:14
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {

        Thread t1 = new Cook();
        Thread t2 = new Foodie();

        t1.start();
        t2.start();
    }
}
