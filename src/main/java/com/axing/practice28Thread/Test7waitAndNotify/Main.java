package com.axing.practice28Thread.Test7waitAndNotify;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @projectName: test1
 * @package: com.axing.practice28Thread.Test7waitAndNotify
 * @className: Server
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/15 下午3:32
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(1);

        Cook cook = new Cook(queue);
        Foodie foodie = new Foodie(queue);

        cook.start();
        foodie.start();
    }
}
