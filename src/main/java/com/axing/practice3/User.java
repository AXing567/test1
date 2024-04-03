package com.axing.practice3;

/**
 * @projectName: test1
 * @package: com.axing.practice3
 * @className: User
 * @author: Axing
 * @description: TODO
 * @date: 2024/3/23 16:48
 * @version: 1.0
 */
public class User {
    // 用户姓名
    private String name;
    // 抢到的红包金额
    private double money;
    // 抢到红包的时间
    private String time;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public User(String name, double money, String time) {
        this.name = name;
        this.money = money;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return name + "抢到了：" + money + "元，时间：" + time;
    }
}
