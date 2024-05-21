package com.axing.practice28Thread.problem1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @projectName: test1
 * @package: com.axing.practice28Thread.problem1
 * @className: Window
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/16 上午9:43
 * @version: 1.0
 */
public class Window implements Runnable {
    static public int ticket = 1;
    static public Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            if (ticket <= 1000) {
                System.out.println(Thread.currentThread().getName() + "正在售卖第" + (ticket++) + "张票");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                break;
            }

            lock.unlock();
        }
    }
}
