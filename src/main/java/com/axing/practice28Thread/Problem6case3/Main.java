package com.axing.practice28Thread.Problem6case3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @projectName: test1
 * @package: com.axing.practice28Thread.Problem5
 * @className: Main
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/16 下午5:03
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700);
        Raffle raffle = new Raffle(list);

        FutureTask<Integer> ft1 = new FutureTask<>(raffle);
        FutureTask<Integer> ft2 = new FutureTask<>(raffle);

        Thread t1 = new Thread(ft1);
        Thread t2 = new Thread(ft2);

        t1.setName("抽奖箱1");
        t2.setName("抽奖箱2");

        t1.start();
        t2.start();

        Integer max1 = ft1.get();
        Integer max2 = ft2.get();
        System.out.println(max1);
        System.out.println(max2);
    }
}
