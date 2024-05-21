package com.axing.practice28Thread.Problem6case2;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @projectName: test1
 * @package: com.axing.practice28Thread.Problem5
 * @className: Raffle
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/16 下午5:05
 * @version: 1.0
 */
public class Raffle implements Runnable {
    ArrayList<Integer> list;


    public Raffle(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        ArrayList<Integer> box = new ArrayList<>();
        while (true) {
            synchronized (Raffle.class) {
                String name = Thread.currentThread().getName();
                if (list.isEmpty()) {
                    System.out.println(name + box);
                    break;
                } else {
                    Collections.shuffle(list);
                    Integer first = list.removeFirst();
                    box.add(first);
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
