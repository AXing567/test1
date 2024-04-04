package com.axing.practice1;

import java.util.*;

/**
 * @projectName: test1
 * @package: com.axing.practice1
 * @className: Test
 * @author: Axing
 * @description: TODO
 * @date: 2024/3/23 15:22
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(2006, "意大利");
        map.put(2002, "巴西");
        map.put(1998, "法国");
        map.put(1994, "巴西");
        map.put(1990, "德国");
        map.put(1986, "阿根廷");
        map.put(1982, "意大利");
        map.put(1978, "阿根廷");
        map.put(1974, "德国");
        map.put(1970, "巴西");
        map.put(1966, "英格兰");
        map.put(1962, "巴西");
        map.put(1958, "巴西");
        map.put(1954, "德国");
        map.put(1950, "乌拉圭");
        map.put(1938, "意大利");
        map.put(1934, "意大利");
        map.put(1930, "乌拉圭");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入年份：");
//        int year = sc.nextInt();
//        if (map.containsKey(year)) {
//            System.out.println(year + "年的世界杯冠军是：" + map.get(year));
//        } else {
//            System.out.println("没有举办世界杯");
//        }


        System.out.println("请输入球队名称：");
        Scanner sc2 = new Scanner(System.in);
        String name = sc2.nextLine();
        List<Integer> list = new ArrayList<>();
        for (Integer key : map.keySet()) {
            if (map.get(key).equals(name)) {
                list.add(key);
            }
        }
        if (list.size() > 0) {
            for (Integer key : list) {
                System.out.print(key + " ");
            }
        } else {
            System.out.println("没有获得过世界杯");
        }


    }

}
