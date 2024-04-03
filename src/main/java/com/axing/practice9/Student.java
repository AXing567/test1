package com.axing.practice9;

/**
 * @projectName: test1
 * @package: com.axing.practice9
 * @className: StudentSystem
 * @author: Axing
 * @description: TODO
 * @date: 2024/3/24 21:17
 * @version: 1.0
 */
public class Student {
    private String name;
    private int age;
    private double score;
    private String classNum;

    public Student(String name, int age, double score, String classNum) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.classNum = classNum;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }
}
