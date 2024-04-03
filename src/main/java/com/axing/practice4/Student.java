package com.axing.practice4;

/**
 * @projectName: test1
 * @package: com.axing.practice4
 * @className: StudentSystem
 * @author: Axing
 * @description: TODO
 * @date: 2024/3/24 15:17
 * @version: 1.0
 */
public class Student {
    private String name;
    private int score;

    public Student() {
    }

    @Override
    public String toString() {
        return "StudentSystem{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
