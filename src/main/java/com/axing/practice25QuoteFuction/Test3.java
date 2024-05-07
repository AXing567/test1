package com.axing.practice25QuoteFuction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "aaaa", "aaaa", "aaaa", "bbb", "cccc", "dddd", "eee", "ffff", "ggg");
        List<String> list1 = list.stream().map(String::toUpperCase).toList();
        System.out.println(list1);
    }
}
