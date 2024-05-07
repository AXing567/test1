package com.axing.practice25QuoteFuction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "111", "222", "333", "4444", "555", "666", "7", "8", "0");
        String[] array = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int i) {
                return new String[i];
            }
        });
        System.out.println(Arrays.toString(array));

        String[] array1 = list.stream().toArray(String[]::new);
        System.out.println(Arrays.toString(array1));
    }
}
