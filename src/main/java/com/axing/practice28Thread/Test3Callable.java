package com.axing.practice28Thread;

import java.util.concurrent.Callable;

/**
 * @projectName: test1
 * @package: com.axing.practice28Thread
 * @className: Test3Callable
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/14 下午4:55
 * @version: 1.0
 */
public class Test3Callable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}
