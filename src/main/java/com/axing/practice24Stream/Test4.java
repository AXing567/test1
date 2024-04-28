package com.axing.practice24Stream;

import java.util.*;
import java.util.stream.Collectors;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "aaaa", "aaaa", "aaaa", "bbb", "cccc", "dddd", "eee", "ffff", "ggg");
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "啊啊啊", "哦哦哦");
        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3, "张三-男-20", "李四-女-18");

        List<String> collectList = list.stream().filter(s -> s.length() == 3).collect(Collectors.toList());

        Set<String> collectSet = list.stream().filter(s -> s.startsWith("a")).collect(Collectors.toSet());

        Map<String, Integer> collectMap = list3.stream().filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(s -> s.split("-")[0],
                        s -> Integer.parseInt(s.split("-")[2])));

        collectList.forEach(System.out::println);


        System.out.println("==========================");
        collectSet.forEach(System.out::println);


        System.out.println("==========================");
        collectMap.forEach((key, value) -> System.out.println(key + ":" + value));
    }
}
