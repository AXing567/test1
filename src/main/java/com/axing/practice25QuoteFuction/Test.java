package com.axing.practice25QuoteFuction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test extends Father{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5","6","7","8");
        List<Integer> list2 = list.stream().map(Integer::parseInt).toList();
        System.out.println(list2);

        // 2的倍数
        Father father = new Father();
        list2.stream().filter(father::even).forEach(System.out::println);
        list2.stream().filter(new Test()::even).forEach(System.out::println);


    }
    public void test(){
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5","6","7","8");
        List<Integer> list2 = list.stream().map(Integer::parseInt).toList();
        System.out.println(list2);
        list2.stream().filter(this::even).forEach(System.out::println);
        list2.stream().filter(super::even).forEach(System.out::println);


    }

    public boolean even(int n) {
        return super.even(n);
    }
}
