package com.axing.practice22Map;

import java.util.Map;
import java.util.TreeMap;

public class Test7TreeMap {
    public static void main(String[] args) {
        /* 需求：
        字符串“aababcabcdabcde”
        请统计字符串中每一个字符出现的次数，并按照以下格式输出
        输出结果：
        a（5）b（4）c（3）d（2）e（1）

            新的统计思想：利用map集合进行统计

          如果题目中没有要求对结果进行排序，默认使用HashMap
          如果题目中要求对结果进行排序，请使用TreeMap

          键：表示要统计的内容
          值：表示次数

        */
        String s = "aababcabcdabcde";
        TreeMap<Character, Integer> sitm = new TreeMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (sitm.containsKey(c)) {
                sitm.put(c, sitm.get(c) + 1);
            } else {
                sitm.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : sitm.entrySet()) {
            System.out.print(entry.getKey() + "(" + entry.getValue() + ")");
        }
    }
}
