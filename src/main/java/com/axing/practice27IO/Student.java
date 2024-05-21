package com.axing.practice27IO;

import java.io.Serial;
import java.io.Serializable;

/**
 * @projectName: test1
 * @package: com.axing.practice27IO
 * @className: Student
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/8 下午7:55
 * @version: 1.0
 */
public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = -5299232486168241377L;
    private String name;
    private int age;
    // 不参与序列化及反序列化
    private transient String address;

    public Student() {
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public Student(String name, int age) {
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

    /**
     * 获取
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", address = " + address + "}";
    }
}
