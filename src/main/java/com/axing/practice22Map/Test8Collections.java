package com.axing.practice22Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test8Collections {
    public static void main(String[] args) {
        /* 班级里有N个学生
        要求：
        70%的概率随机到男生
        30%的概率随机到女生

        "范闲","范建","范统","杜子腾","宋合泛","侯笼藤","朱益群","朱穆朗玛峰",
        "杜琦燕","袁明媛","李猜","田蜜蜜",
        */

        ArrayList<String> boys = new ArrayList<>();
        ArrayList<String> girls = new ArrayList<>();
        Collections.addAll(boys,"范闲","范建","范统","杜子腾","宋合泛","侯笼藤","朱益群","朱穆朗玛峰");
        Collections.addAll(girls,"杜琦燕","袁明媛","李猜","田蜜蜜");

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,1,1,1,1,1,1,0,0,0);
        Collections.shuffle(list);
        Random random = new Random();
        System.out.println(list.getFirst());
        if(list.getFirst() == 1){
            System.out.println(boys.get(random.nextInt(boys.size())));
        }else{
            System.out.println(girls.get(random.nextInt(girls.size())));
        }
    }
}
