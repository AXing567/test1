package com.axing.practice25QuoteFuction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "aaaa", "aaaa", "aaaa", "bbb", "cccc", "dddd", "eee", "ffff", "ggg");
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "啊啊啊", "哦哦哦");
        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3, "张三-男-20", "李四-女-18");

        List<Student> list4 = list3.stream().map(Student::new).toList();
        System.out.println(list4);

    }
}
