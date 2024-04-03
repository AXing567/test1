package com.axing.StudentManagementSystem;

/**
 * @projectName: test1
 * @package: com.axing.StudentManagementSystem
 * @className: User
 * @author: Axing
 * @description: TODO
 * @date: 2024/4/2 10:59
 * @version: 1.0
 */
public class User {
    private String id;
    private String pwd;
    private String idNumber;
    private String phoneNumber;

    public User() {
    }

    public User(String id, String pwd, String idNumber, String phoneNumber) {
        this.id = id;
        this.pwd = pwd;
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return pwd
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * 设置
     * @param pwd
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * 获取
     * @return idNumber
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * 设置
     * @param idNumber
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * 获取
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return "User{id = " + id + ", pwd = " + pwd + ", idNumber = " + idNumber + ", phoneNumber = " + phoneNumber + "}";
    }
}
