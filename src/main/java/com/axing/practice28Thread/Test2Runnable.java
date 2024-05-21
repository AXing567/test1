package com.axing.practice28Thread;

/**
 * @projectName: test1
 * @package: com.axing.practice28Thread
 * @className: Test2Runnable
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/14 上午10:59
 * @version: 1.0
 */
public class Test2Runnable implements Runnable{


    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for (int i = 0; i <= 100; i++) {
            System.out.println(t.getName()+ ":" + i);

        }
    }
}
