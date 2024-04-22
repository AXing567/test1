package com.axing.practice19Compute;

public class Test {
    public static void main(String[] args) {
        System.out.println(countPeach(1));

        System.out.println(climbStairs(20));
    }

    // 猴子吃桃子
    public static int countPeach(int day){
        if(day > 10 || day < 1){
            System.out.println("time error");
            return -1;
        }

        if (day == 10){
            return 1;
        }
        // 前一天桃子的个数为后一天桃子个数加一乘二
        return (countPeach(day + 1) + 1) * 2;
    }

    // 爬楼梯
    public static int climbStairs(int stairs){
        if(stairs == 1){
            return 1;
        }
        if(stairs == 2){
            return 2;
        }
        if(stairs == 3){
            return 4;
        }

        return climbStairs(stairs - 1) + climbStairs(stairs - 2) + climbStairs(stairs - 3);

    }
}
