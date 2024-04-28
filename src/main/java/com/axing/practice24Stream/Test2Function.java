package com.axing.practice24Stream;

import java.util.ArrayList;
import java.util.Collections;

public class Test2Function {
    public static int sum = 0;

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "aaaa", "aaaa", "aaaa", "bbb", "cccc", "dddd", "eee", "ffff", "ggg");
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "啊啊啊", "哦哦哦");
        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3, "张三-20", "李四-18");


//        set.stream().filter(s -> s.length() == 3).forEach(s -> System.out.print(s + "  "));

//        list.stream().limit(3).forEach(s -> System.out.print(s + "  "));

//        list.stream().skip(3).forEach(s -> System.out.print(s + "  "));

//        list.stream().distinct().forEach(s -> System.out.print(s + "  "));

//        Stream.concat(list.stream(), list2.stream()).forEach(s -> System.out.print(s + "  "));


        list3.stream().map(s -> Integer.parseInt(s.split("-")[1])).forEach(n -> sum += n);
        System.out.println((int) sum);
    }
}
