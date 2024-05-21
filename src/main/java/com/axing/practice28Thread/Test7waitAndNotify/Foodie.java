package com.axing.practice28Thread.Test7waitAndNotify;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @projectName: test1
 * @package: com.axing.practice28Thread.Test7waitAndNotify
 * @className: Foodie
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/15 下午3:32
 * @version: 1.0
 */
public class Foodie extends Thread {
    ArrayBlockingQueue<String> queue;

    public Foodie(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String take = queue.take();
                System.out.println("餐客食用了" + take);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
