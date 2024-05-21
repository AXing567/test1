package com.axing.practice28Thread;

/**
 * @projectName: test1
 * @package: com.axing.practice28Thread
 * @className: Test1Thread
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/14 上午10:53
 * @version: 1.0
 */
public class Test1Thread extends Thread {
    public Test1Thread(Runnable task) {
        super(task);
    }

    public Test1Thread() {

    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ";" + i);
        }

    }
}

