package com.axing.practice24Stream;

import java.util.ArrayList;
import java.util.Collections;

public class Problem1 {
    public static void main(String[] args) {
        // 过滤奇数，保留偶数
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        list.stream().filter(i -> i % 2 == 0).forEach(System.out::println   );
    }
}
