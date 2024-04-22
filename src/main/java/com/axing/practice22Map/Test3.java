package com.axing.practice22Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Test3 {
    public static void main(String[] args) {
        // 利用哈希表特性去重  给自定义对象
        Student stu1 = new Student("zhangsan", 20);
        Student stu2 = new Student("lisi", 21);
        Student stu3 = new Student("wangwu", 22);
        Student stu4 = new Student("wangwu", 22);
        HashMap<Student, Integer> studentIntegerHashMap = new HashMap<>();
        studentIntegerHashMap.put(stu1, 1);
        studentIntegerHashMap.put(stu2, 2);
        studentIntegerHashMap.put(stu3, 3);
        // 重写了Student类中的hashCode方法以及equals方法后，stu4会视作与stu3相等
        studentIntegerHashMap.put(stu4, 4);

        for (Map.Entry<Student, Integer> i : studentIntegerHashMap.entrySet()) {
            System.out.println(i.getKey().toString() + ':' + i.getValue());
        }
    }

}

class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
