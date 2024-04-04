package com.axing.practice14ArrayList;

/**
 * @projectName: test1
 * @package: com.axing.practice14ArrayList
 * @className: Student
 * @author: Axing
 * @description: TODO
 * @date: 2024/3/29 20:34
 * @version: 1.0
 */
public class Student {
    private String id;
    private String username;
    private String password;

    public Student() {
    }

    public Student(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    /**
     * 获取
     *
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     *
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return "Student{id = " + id + ", username = " + username + ", password = " + password + "}";
    }
}
