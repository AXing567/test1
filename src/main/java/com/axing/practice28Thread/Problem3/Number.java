package com.axing.practice28Thread.Problem3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @projectName: test1
 * @package: com.axing.practice28Thread.Problem3
 * @className: Number
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/16 上午9:58
 * @version: 1.0
 */
public class Number implements Runnable {
    public static Lock lock = new ReentrantLock();
    public static int i = 1;

    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                if (i > 100) {
                    break;
                } else {
                    if (i % 2 == 1) {
                        System.out.println(Thread.currentThread().getName() + " : " + i);
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            } finally {
                i++;
                lock.unlock();
            }
        }
    }
}
