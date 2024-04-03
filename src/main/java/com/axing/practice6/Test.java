package com.axing.practice6;

import java.util.HashSet;
import java.util.Set;

/**
 * @projectName: test1
 * @package: com.axing.practice6
 * @className: Test
 * @author: Axing
 * @description: TODO
 * @date: 2024/3/24 16:22
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("张三");
        set.add("李四");
        set.add("王五");
        set.add("钱六");
        set.add("张三");
        for(String str : set){
            System.out.print(str + " ");
        }


    }
}
