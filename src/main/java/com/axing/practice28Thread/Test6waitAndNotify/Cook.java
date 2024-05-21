package com.axing.practice28Thread.Test6waitAndNotify;

/**
 * @projectName: test1
 * @package: com.axing.practice28Thread.Test6waitAndNotify
 * @className: Cook
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/15 上午11:10
 * @version: 1.0
 */
public class Cook extends Thread {

    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    if (Desk.foodFlag == 1) {
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        System.out.println("厨师做了一碗面条");
                        Desk.lock.notifyAll();
                        Desk.foodFlag = 1;
                    }
                }
            }
        }
    }
}
