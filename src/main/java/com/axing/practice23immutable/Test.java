package com.axing.practice23immutable;

import java.lang.reflect.Array;
import java.util.*;

public class Test {
    public static void main(String[] args) {
//        "张三","李四","王五","赵六"


        // 可变map
        Map<String, String> map2 = new HashMap<>();
        map2.put("张三", "李四");
        map2.put("王五", "赵六");

        // 不可变集合
        List<String> list = List.of("张三", "李四", "王五", "赵六");
        Set<String> set = Set.of("张三", "李四", "王五", "赵六");
        // 最多只能放十个键值对
        Map<String, String> map = Map.of("张三", "李四", "王五", "赵六");
        // 最简便的方法
        Map<String, String> map3 = Map.copyOf(map2);
        // jdk10以前得用这么麻烦的，不如map3
        Map<Object, Object> map4 = Map.ofEntries(map2.entrySet().toArray(new Map.Entry[0]));
        System.out.println(map3);

    }
}
