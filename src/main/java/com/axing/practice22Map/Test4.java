package com.axing.practice22Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
         /*
            某个班级80名学生，现在需要组成秋游活动，
            班长提供了四个景点依次是（A、B、C、D）,
            每个学生只能选择一个景点，请统计出最终哪个景点想去的人数最多。
        */
        // 生成投票数据
        Random random = new Random();
        char[] name = {'A', 'B', 'C', 'D'};
        ArrayList<Character> characters = new ArrayList<>();
        for (int i = 0; i < 80; i++) {
            int index = random.nextInt(name.length);
            characters.add(name[index]);
//            System.out.println(name[index]);
        }
        // 统计投票数据(通过hashMap去重的特性，景区名（key）重复则值（value）加一，反之放入键值对（景区名字,1）
        HashMap<Character, Integer> shp = new HashMap<>();
        for (Character c : characters) {
            if (shp.containsKey(c)) {
                shp.put(c, shp.get(c) + 1);
            } else {
                shp.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : shp.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        // 统计哪对键值对的值最大
        int max = 0;
        char c = 0;
        for (Map.Entry<Character, Integer> entry : shp.entrySet()) {
            if (entry.getValue() > max) {
                c = entry.getKey();
                max = entry.getValue();
            }
        }
        System.out.println();
        System.out.println("firstMaxValue:" + c + ":" + max);

    }
}
