package com.axing.practice22Map;

import java.util.Comparator;
import java.util.TreeMap;

public class Test5TreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> istm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return t1 - integer;
            }
        });
        istm.put(1,"goods1");
        istm.put(2,"goods2");
        istm.put(3,"goods3");
        istm.put(3,"goods4");
        System.out.println(istm);
    }
}
