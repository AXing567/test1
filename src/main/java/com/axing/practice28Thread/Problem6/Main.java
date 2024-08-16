package com.axing.practice28Thread.Problem6;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @projectName: test1
 * @package: com.axing.practice28Thread.Problem5
 * @className: Server
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/16 下午5:03
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700);
        Raffle raffle = new Raffle(list);
        Thread t1 = new Thread(raffle);
        Thread t2 = new Thread(raffle);
        t1.setName("抽奖箱1");
        t2.setName("抽奖箱2");
        t1.start();
        t2.start();
    }
}
