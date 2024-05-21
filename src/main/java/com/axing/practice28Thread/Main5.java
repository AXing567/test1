package com.axing.practice28Thread;

/**
 * @projectName: test1
 * @package: com.axing.practice28Thread
 * @className: Main5
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/14 下午8:12
 * @version: 1.0
 */
public class Main5 {
    public static void main(String[] args) {
        Test5Lock t = new Test5Lock();

        Thread thread1 = new Thread(t);
        Thread thread2 = new Thread(t);
        Thread thread3 = new Thread(t);

        thread1.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");  

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
