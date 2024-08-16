package com.axing.practice28Thread.problem1;

/**
 * @projectName: test1
 * @package: com.axing.practice28Thread.problem1
 * @className: Server
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/16 上午9:42
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Window window = new Window();
        Thread t1 = new Thread(window);
        Thread t2 = new Thread(window);

        t1.setName("窗口1");
        t2.setName("窗口2");

        t1.start();
        t2.start();
    }
}
