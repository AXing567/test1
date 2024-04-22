package com.axing.practice22Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("zhangsan","haha");
        stringStringHashMap.put("lisi","heihei");
        stringStringHashMap.put("wangwu","houhou");

        // 遍历方式1
//        for (Map.Entry<String, String> stringStringEntry : stringStringHashMap.entrySet()) {
//            System.out.println(stringStringEntry.getKey() + ':' + stringStringEntry.getValue());
//        }
        // 遍历方式2
//        Iterator<Map.Entry<String, String>> iterator = stringStringHashMap.entrySet().iterator();
//        while (iterator.hasNext()){
//            Map.Entry<String, String> next = iterator.next();
//            System.out.println(next.getKey() + ':' + next.getValue());
//        }
        // 遍历方式3
        stringStringHashMap.entrySet().forEach((s) -> System.out.println(s.getKey() + ':' + s.getValue()));

    }
}
