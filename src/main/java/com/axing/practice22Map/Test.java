package com.axing.practice22Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("zhangsan","haha");
        stringStringHashMap.put("lisi","heihei");
        stringStringHashMap.put("wangwu","houhou");
        // 遍历方式1
//        for (String s : stringStringHashMap.keySet()) {
//            System.out.println(s + ':' + stringStringHashMap.get(s));
//        }
        // 遍历方式2
//        Iterator<String> iterator = stringStringHashMap.keySet().iterator();
//        while(iterator.hasNext()){
//            String next = iterator.next();
//            System.out.println(next + ':' + stringStringHashMap.get(next));
//        }
        // 遍历方式3
        stringStringHashMap.keySet().forEach((s) -> System.out.println(s + ':' + stringStringHashMap.get(s)));




    }
}
