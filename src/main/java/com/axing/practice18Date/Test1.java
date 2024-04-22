package com.axing.practice18Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) throws ParseException {
        // 解析字符串为date对象
        // 定义时间字符串
        String date = "2023-4-16 2:39:00";
        // 创建指定格式SimpleDateFormat对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 用SimpleDateFormat对象解析时间字符串并赋值给date对象
        Date date1 = sdf.parse(date);
        System.out.println(date1);


        // 指定格式输出date对象
        // 生成日期格式化类并调用其format方法
        System.out.println((new SimpleDateFormat()).format(new Date()));

    }
}
