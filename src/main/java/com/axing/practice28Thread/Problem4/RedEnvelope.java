package com.axing.practice28Thread.Problem4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @projectName: test1
 * @package: com.axing.practice28Thread
 * @className: RedEnvelope
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/16 上午10:14
 * @version: 1.0
 */
public class RedEnvelope implements Runnable {
    //    public static double money = 100;
    public static BigDecimal money = new BigDecimal("100.0");
    public static int number = 3;
    public static final double MIN = 0.01;
    public static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        lock.lock();
        String name = Thread.currentThread().getName();
        if (number > 0) {
            if (number == 1) {
                System.out.println(name + "抢到了" + money + "元");
            } else {
                Random rd = new Random();
//                double bound = money - ((number - 1) * MIN);
                BigDecimal bound = money.subtract(new BigDecimal((number - 1) * MIN));
                BigDecimal price = BigDecimal.valueOf(rd.nextDouble(bound.toBigInteger().doubleValue()));
                price = price.setScale(2, RoundingMode.HALF_UP);
                if (price.doubleValue() < MIN) {
                    price = new BigDecimal(MIN);
                }
                System.out.println(name + "抢到了" + price + "元");
                money = money.subtract(price);
            }
            number--;
        } else {
            System.out.println(name + "没抢到红包");
        }
        lock.unlock();
    }
}
