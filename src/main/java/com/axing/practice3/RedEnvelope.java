package com.axing.practice3;

import java.util.ArrayList;
import java.util.List;

/**
 * @projectName: test1
 * @package: com.axing.practice3
 * @className: RedEnvelope
 * @author: Axing
 * @description: TODO
 * @long: 2024/3/23 16:46
 * @version: 1.0
 */
public class RedEnvelope {
    // 红包金额
    private double money;
    // 红包个数
    private int num;
    // 红包过期时间
    private long deadline;
    // 抢红包的用户
    private List<User> list = new ArrayList<User>();

    public long getDeadline() {
        return deadline;
    }

    public void setDeadline(long deadline) {
        this.deadline = deadline;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }

    public RedEnvelope() {
    }

    public RedEnvelope(double money, int num) {
        this.money = money;
        this.num = num;
    }
}
