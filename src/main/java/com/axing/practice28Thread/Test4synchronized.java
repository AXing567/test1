package com.axing.practice28Thread;

/**
 * @projectName: test1
 * @package: com.axing.practice28Thread
 * @className: Test4synchronized
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/14 下午5:34
 * @version: 1.0
 */
public class Test4synchronized extends Thread {
    static int ticket = 0;
    static final Object o = new Object();


    @Override
    public void run() {
        while (true) {
            synchronized (o) {
                if (ticket <= 100) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(getName() + "正在卖第" + (ticket++) + "张票");
                } else {
                    break;
                }
            }
        }
    }
}
