package com.axing.practice28Thread.Problem2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @projectName: test1
 * @package: com.axing.practice28Thread.Problem2
 * @className: GiveGift
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/16 上午9:51
 * @version: 1.0
 */
public class GiveGift implements Runnable{
    static public int gift = 100;
    public static Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true){
            lock.lock();
            try {
                if (gift < 10){
                    break;
                }else {
                    System.out.println(Thread.currentThread().getName() + (--gift));
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            } finally {
                lock.unlock();
            }

        }
    }
}
