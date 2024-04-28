package com.axing.practice24Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "aaaa", "aaaa", "aaaa", "bbb", "cccc", "dddd", "eee", "ffff", "ggg");
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "啊啊啊", "哦哦哦");
        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3, "张三-20", "李四-18");

//        System.out.println(list.stream().filter(s -> s.length() == 3).count());

//        Object[] arr = list.stream().toArray();
//        System.out.println(Arrays.toString(arr));

        String[] arr2 = list.stream().filter(s -> s.startsWith("a")).toArray(value -> new String[value]);
        String[] arr3 = list.stream().filter(s -> s.startsWith("a")).toArray(String[]::new);
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));


    }
}
