package com.axing.practice18Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test3 {
    public static void main(String[] args) throws ParseException {
        // 给定活动开始时间结束时和参加活动时间，判断是否参加成功
        String startTime = "2023-11-11 8:00:00";
        String endTime = "2023-11-11 8:10:00";
        String orderTime = "2023-11-11 8:01:00";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date startDate = sdf.parse(startTime);
        Date endDate = sdf.parse(endTime);
        Date orderDate = sdf.parse(orderTime);

        long startDateTime = startDate.getTime();
        long endDateTime = endDate.getTime();
        long orderDateTime = orderDate.getTime();

        if (orderDateTime >= startDateTime && orderDateTime <= endDateTime) {
            System.out.println("OK!");
        } else {
            System.out.println("NO!");
        }

    }
}
