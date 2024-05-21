package com.axing.practice28Thread;

/**
 * @projectName: test1
 * @package: com.axing.practice28Thread
 * @className: Main2
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/14 上午10:55
 * @version: 1.0
 */
public class Main2 {
    public static void main(String[] args) {
        Test2Runnable r = new Test2Runnable();
        Thread t = new Thread(r);
        Thread t2 = new Thread(r);


        t.start();
        t2.start();
        t.setName("线程1");
        t2.setName("线程2");
    }
}
