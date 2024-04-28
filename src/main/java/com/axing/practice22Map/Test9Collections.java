package com.axing.practice22Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test9Collections {
    public static void main(String[] args) {

       /* 班级里有5个学生
        要求：
        被点到的学生不会再被点到。
        但是如果班级中所有的学生都点完了，需要重新开启第二轮点名。*/
        //1.定义集合
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        //2.添加数据
        Collections.addAll(list1, "范闲", "范建", "范统", "杜子腾", "杜琦燕", "宋合泛", "侯笼藤", "朱益群", "朱穆朗玛峰", "袁明媛");
        Random rd = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println("----------------" + (i + 1) + "----------------");
            int size = list1.size();
            for (int j = 0; j < size; j++) {
                String name;
                System.out.print((name = list1.remove(rd.nextInt(list1.size()))) + "  ");
                list2.add(name);
            }
            System.out.println();
            list1.addAll(list2);
            list2.clear();
        }
    }
}
