package com.axing.practice12;

/**
 * @projectName: test1
 * @package: com.axing.practice12
 * @className: Student
 * @author: Axing
 * @description: TODO
 * @date: 2024/3/27 20:44
 * @version: 1.0
 */
public class Student {
    // 姓名
    private String name;
    // 年龄
    private int age;
    // 学号
    private int studentId;

    public Student() {
    }

    public Student(String name, Integer age, int studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
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
    public Integer getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return studentId
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * 设置
     *
     * @param studentId
     */
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", studentId = " + studentId + "}";
    }
}
