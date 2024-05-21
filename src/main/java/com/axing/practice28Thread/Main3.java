package com.axing.practice28Thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @projectName: test1
 * @package: com.axing.practice28Thread
 * @className: Main3
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/14 下午4:56
 * @version: 1.0
 */
public class Main3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Test3Callable t = new Test3Callable();
        FutureTask<Integer> ift = new FutureTask<>(t);
        Thread thread = new Thread(ift);
        thread.start();
        Integer i = ift.get();
        System.out.println(i);
    }
}
