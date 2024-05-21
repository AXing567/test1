package com.axing.practice28Thread.Problem5;

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
        while (true) {
            synchronized (Raffle.class) {
                if (list.isEmpty()) {
                    break;
                } else {
                    Collections.shuffle(list);
                    Integer first = list.remove(0);
                    System.out.println(Thread.currentThread().getName() + "抽到了" + first + "元大奖");
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
