package com.axing.Pojo;

import java.nio.charset.Charset;

/**
 * @projectName: test1
 * @package: com.axing.Pojo
 * @className: User
 * @author: Axing
 * @description: TODO
 * @date: 2024/6/24 下午11:48
 * @version: 1.0
 */
public class User {
    private Charset userName;
    private Charset password;
    private Charset name;
    private Charset mobilePhone;
    private Short permission;
    private Charset token;

    public User() {
    }

    public User(Charset userName, Charset password, Charset name, Charset mobilePhone, Short permission, Charset token) {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.mobilePhone = mobilePhone;
        this.permission = permission;
        this.token = token;
    }

    /**
     * 获取
     * @return userName
     */
    public Charset getUserName() {
        return userName;
    }

    /**
     * 设置
     * @param userName
     */
    public void setUserName(Charset userName) {
        this.userName = userName;
    }

    /**
     * 获取
     * @return password
     */
    public Charset getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(Charset password) {
        this.password = password;
    }

    /**
     * 获取
     * @return name
     */
    public Charset getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(Charset name) {
        this.name = name;
    }

    /**
     * 获取
     * @return mobilePhone
     */
    public Charset getMobilePhone() {
        return mobilePhone;
    }

    /**
     * 设置
     * @param mobilePhone
     */
    public void setMobilePhone(Charset mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    /**
     * 获取
     * @return permission
     */
    public Short getPermission() {
        return permission;
    }

    /**
     * 设置
     * @param permission
     */
    public void setPermission(Short permission) {
        this.permission = permission;
    }

    /**
     * 获取
     * @return token
     */
    public Charset getToken() {
        return token;
    }

    /**
     * 设置
     * @param token
     */
    public void setToken(Charset token) {
        this.token = token;
    }

    public String toString() {
        return "User{userName = " + userName + ", password = " + password + ", name = " + name + ", mobilePhone = " + mobilePhone + ", permission = " + permission + ", token = " + token + "}";
    }
}
