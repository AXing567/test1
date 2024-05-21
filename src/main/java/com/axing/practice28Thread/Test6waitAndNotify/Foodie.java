package com.axing.practice28Thread.Test6waitAndNotify;

/**
 * @projectName: test1
 * @package: com.axing.practice28Thread.Test6waitAndNotify
 * @className: Foodie
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/15 上午10:53
 * @version: 1.0
 */
public class Foodie extends Thread {

    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    if (Desk.foodFlag == 0) {
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        System.out.println("吃！！还能吃" + (--Desk.count));
                        Desk.lock.notifyAll();
                        Desk.foodFlag = 0;
                    }
                }

            }
        }
    }
}
