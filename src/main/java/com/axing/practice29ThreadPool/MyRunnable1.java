package com.axing.practice29ThreadPool;

/**
 * @projectName: test1
 * @package: com.axing.practice29ThreadPool
 * @className: MyRunnable1
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/21 上午11:08
 * @version: 1.0
 */
public class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "运行了" + i);
        }
    }
}
