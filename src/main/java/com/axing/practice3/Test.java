package com.axing.practice3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @projectName: test1
 * @package: com.axing.practice3
 * @className: Test
 * @author: Axing
 * @description: TODO
 * @date: 2024/3/23 16:46
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        // 创建一个红包
        RedEnvelope re = new RedEnvelope(100.00, 3);
        // 设置红包的过期时间 三天后
        setDeadline(re, 3);
        // 创建用户
        User user1 = new User("张三");
        User user2 = new User("李四");
        User user3 = new User("王五");
        User user4 = new User("赵六");
        User user5 = new User("钱七");
        // 抢红包
        openRedEnvelope(re, user1);
        openRedEnvelope(re, user3);
        openRedEnvelope(re, user2);
        openRedEnvelope(re, user4);
        openRedEnvelope(re, user5);
        // 显示红包信息
        System.out.println("红包信息：");
        showRedEnvelope(re);
    }

    /**
     * @param re:
     * @param user:
     * @return void
     * @author Axing
     * @description 抢红包
     * @date 2024/3/23 18:05
     */
    public static void openRedEnvelope(RedEnvelope re, User user) {
        // 判断红包是否已经抢完
        if (re.getNum() == 0) {
            System.out.println("红包已经抢完了");
        } else if (re.getDeadline() < System.currentTimeMillis()) {
            // 判断红包是否已经过期
            System.out.println("红包已经过期了");
        } else if (re.getNum() == 1) {
            // 设置最后一个人抢到的红包金额
            user.setMoney(re.getMoney());
            // 设置抢到红包的时间以及日期格式
            SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            user.setTime(ft.format(new Date()));
            // 添加到已抢红包人员列表
            re.getList().add(user);
            // 红包个数减一
            re.setNum(re.getNum() - 1);
            // 红包金额清零
            re.setMoney(0);
            System.out.println(user.getName() + "抢到了" + user.getMoney() + "元");
        } else {
            //红包数量大于1时

            // 随机生成一个金额 保留两位小数
            double money = Math.random() * (re.getMoney() / re.getNum() * 2 - 0.01) + 0.01;
            BigDecimal bd = new BigDecimal(money);
            money = bd.setScale(2, RoundingMode.DOWN).doubleValue();
            // 设置抢到红包的时间以及日期格式
            SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            user.setTime(ft.format(new Date()));
            user.setMoney(money);
            re.getList().add(user);
            re.setNum(re.getNum() - 1);
            // 保持小数减法运算精度
            BigDecimal b1 = new BigDecimal(Double.toString(re.getMoney()));
            BigDecimal b2 = new BigDecimal(Double.toString(money));
            re.setMoney(b1.subtract(b2).doubleValue());
            System.out.println(user.getName() + "抢到了" + user.getMoney() + "元");
        }

    }

    /**
     * @param re:
     * @return void
     * @author Axing
     * @description 显示红包信息及抢到红包的用户
     * @date 2024/3/23 18:05
     */
    public static void showRedEnvelope(RedEnvelope re) {
        for (User user : re.getList()) {
            System.out.println(user.toString());
        }
        System.out.println("红包剩余金额：" + re.getMoney());
        System.out.println("红包剩余个数：" + re.getNum());
    }

    /**
     * @param re:
     * @param day:
     * @return void
     * @author Axing
     * @description 设置截止日期
     * @date 2024/3/23 17:33
     */
    public static void setDeadline(RedEnvelope re, int day) {
        Date date = new Date();
        long deadline = date.getTime() + 1000L * 60 * 60 * 24 * day;
        re.setDeadline(deadline);
    }
}
