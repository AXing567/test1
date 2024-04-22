package com.axing.practice22Map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Test6TreeMap {
    public static void main(String[] args) {
        TreeMap<Student, String> sstm = new TreeMap<>((s1, s2) -> {
            int i = s1.getAge() - s2.getAge();
            i = i == 0 ? s1.getName().compareTo(s2.getName()) : i;
            return i;
        });
        sstm.put(new Student("wangwu",22),"chengdu");
        sstm.put(new Student("lisi",21),"hunan");
        sstm.put(new Student("zhangsan",20),"heilongjiang");
        sstm.put(new Student("axing",20),"xian");
        sstm.put(new Student("zhangsan",20),"hubei");
        for (Map.Entry<Student, String> entry : sstm.entrySet()) {
            System.out.println(entry.getKey().toString() + "=" + entry.getValue());
        }
    }
}
