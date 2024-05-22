package com.axing.practice29ThreadPool;

import java.util.concurrent.*;

/**
 * @projectName: test1
 * @package: com.axing.practice29ThreadPool
 * @className: Test1
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/21 上午11:06
 * @version: 1.0
 */
public class Test1 {
    public static void main(String[] args) {

        // 第一种 线程池 无需指定线程池容量
        try (ExecutorService pool = Executors.newCachedThreadPool()) {
            pool.submit(new MyRunnable1());
            pool.submit(new MyRunnable1());
            pool.submit(new MyRunnable1());
            pool.submit(new MyRunnable1());
            pool.submit(new MyRunnable1());

        }
        // 第二种线程池 需要指定线程数
        try (ExecutorService pool = Executors.newFixedThreadPool(3)) {
            pool.submit(new MyRunnable1());
            Thread.sleep(1000);
            pool.submit(new MyRunnable1());
            Thread.sleep(1000);
            pool.submit(new MyRunnable1());
            Thread.sleep(1000);
            pool.submit(new MyRunnable1());
            Thread.sleep(1000);
            pool.submit(new MyRunnable1());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // 自定义线程池 用法同上
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,
                6,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        pool.submit(new MyRunnable1());

        pool.close();

    }
}
