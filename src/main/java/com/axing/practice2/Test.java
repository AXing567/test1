package com.axing.practice2;

import java.util.*;

/**
 * @projectName: test1
 * @package: com.axing.practice2
 * @className: Test
 * @author: Axing
 * @description: TODO
 * @date: 2024/3/23 15:58
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Tom", "CoreJava");
        map.put("John", "Oracle");
        map.put("Susan", "Oracle");
        map.put("Jerry", "JDBC");
        map.put("Jim", "Unix");
        map.put("Kevin", "JSP");
        map.put("Lucy", "JSP");

        map.put("Allen", "JDBC");
        map.put("Lucy", "CoreJava");
        Set<Map.Entry<String, String>> set = map.entrySet();
        for (Map.Entry<String, String> entry : set) {
            System.out.println(entry.getKey() + " teachs " + entry.getValue());
        }

        List<String> list = new ArrayList<>();
        for (Map.Entry<String, String> entry : set) {
            if ("JSP".equals(entry.getValue())) {
                list.add(entry.getKey());
            }
        }
        for (String key : list) {
            System.out.println(key);
        }

    }
}
