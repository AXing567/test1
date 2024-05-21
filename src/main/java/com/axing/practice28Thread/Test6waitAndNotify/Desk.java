package com.axing.practice28Thread.Test6waitAndNotify;

/**
 * @projectName: test1
 * @package: com.axing.practice28Thread.Test6waitAndNotify
 * @className: Desk
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/15 上午10:51
 * @version: 1.0
 */
public class Desk {
    public static int foodFlag = 0;
    public static int count = 10;
    public static Object lock = new Object();
}
