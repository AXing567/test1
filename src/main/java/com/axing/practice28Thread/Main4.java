package com.axing.practice28Thread;

/**
 * @projectName: test1
 * @package: com.axing.practice28Thread
 * @className: Main4
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/14 下午5:38
 * @version: 1.0
 */
public class Main4 {
    public static void main(String[] args) {
        Test4synchronized thread1 = new Test4synchronized();
        Test4synchronized thread2 = new Test4synchronized();
        Test4synchronized thread3 = new Test4synchronized();

        thread1.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
