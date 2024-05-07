package com.axing.practice25QuoteFuction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Problem2 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Collections.addAll(students,new Student("张三",30),new Student("张四",29),new Student("彰武",28));
        String[] array = students.stream().map(Student::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(array));

    }
}
