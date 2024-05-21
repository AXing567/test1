package com.axing.practice28Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @projectName: test1
 * @package: com.axing.practice28Thread
 * @className: Test5Lock
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/14 下午8:02
 * @version: 1.0
 */
public class Test5Lock implements Runnable{
    static int ticket = 1;
    Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true){
            lock.lock();
            try {
                if(ticket <= 100){
                    System.out.println(Thread.currentThread().getName() + "正在售卖第" + (ticket++) + "张票。");
                }else {
                    break;
                }
                Thread.sleep(100);
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
    }
}
