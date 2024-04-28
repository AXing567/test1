package com.axing.practice24Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张无忌");
        list.add("赵四");
        list.add("张五");
        list.add("张六");
//        list.stream().filter(name -> name.startsWith("张")).filter(name -> name.length() == 3).forEach(System.out::println);


        HashSet<String> set = new HashSet<>();
        set.add("张三丰");
        set.add("张无忌");
        set.add("赵四");
        set.add("张五");
        set.add("张六");
//        set.stream().filter(name -> name.startsWith("张")).forEach(System.out::println);

        HashMap<String, Integer> map = new HashMap<>();
        map.put("aaa", 111);
        map.put("bbb", 222);
        map.put("ccc", 333);
//        map.entrySet().stream().filter((e) -> e.getKey().length() == 3 && e.getValue() > 200).forEach(System.out::println);
//        map.keySet().stream().filter(k->k.startsWith("a")).forEach(System.out::println);
        int[] arr = {1,2,3,4,5,6};
//        Stream.of(arr).forEach(System.out::print);
        System.out.println();


        Integer[] arr2 = {1,2,3,4,5,6};
//        Stream.of(arr2).forEach(System.out::print);
        System.out.println();


        String[] arr3 = {"a","b","c","d","e"};
//        Stream.of(arr3).forEach(System.out::print);


        Arrays.stream(arr).forEach(System.out::println);

//        Stream.of("a","b","c","d","e").forEach(System.out::print);
    }
}
