package com.axing.practice25QuoteFuction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class Problem1 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Collections.addAll(students,"张三，23","李四，22","王五，21","赵六，20","孙八，19");
        Student2[] array = students.stream().map(Student2::new).toList().toArray(Student2[]::new);
        System.out.println(Arrays.toString(array));

    }
}
class Student2{
    private String name;
    private int age;

    public Student2() {
    }
    public Student2(String str){
        this.name = str.split("，")[0];
        this.age = Integer.parseInt(str.split("，")[1]);


    }
    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student2{name = " + name + ", age = " + age + "}";
    }
}
