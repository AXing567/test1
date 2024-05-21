package com.axing.practice28Thread.Test7waitAndNotify;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @projectName: test1
 * @package: com.axing.practice28Thread.Test7waitAndNotify
 * @className: Cook
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/15 下午3:32
 * @version: 1.0
 */
public class Cook extends Thread {
    ArrayBlockingQueue<String> queue ;

    public Cook(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
                try {
                    queue.put("面条");
                    System.out.println("厨师烹饪了一晚面条");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
        }

    }
}
