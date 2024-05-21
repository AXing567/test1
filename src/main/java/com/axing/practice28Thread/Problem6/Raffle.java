package com.axing.practice28Thread.Problem6;

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

    static ArrayList<Integer> list1 = new ArrayList<>();
    static ArrayList<Integer> list2 = new ArrayList<>();

    public Raffle(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (Raffle.class) {
                String name = Thread.currentThread().getName();
                if (list.isEmpty()) {
                    if ("抽奖箱1".equals(name)){
                        Collections.sort(list1);
                        int sum1 = 0;
                        for (Integer i : list1) {
                            sum1 += i;
                        }
                        System.out.println("抽奖箱1抽到了" + list1.size() + "个奖项");
                        System.out.println("分别为:" + list1 + "最大的奖为:" + list1.getLast() + "总计为:" + sum1);
                    }else {
                        Collections.sort(list2);
                        int sum2 = 0;
                        for (Integer i : list2) {
                            sum2 += i;
                        }
                        System.out.println("抽奖箱2抽到了" + list2.size() + "个奖项");
                        System.out.println("分别为:" + list2 + "最大的奖为:" + list2.getLast() + "总计为:" + sum2);
                    }

                    break;
                } else {
                    Collections.shuffle(list);
                    Integer first = list.removeFirst();
                    if ("抽奖箱1".equals(name)) {
                        list1.add(first);
                    } else {
                        list2.add(first);
                    }
//                    System.out.println(name + "抽到了" + first + "元大奖");
                }
            }
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }
}
