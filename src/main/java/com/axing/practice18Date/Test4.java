package com.axing.practice18Date;

import java.util.Calendar;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(year + "年" + month + "月" + day + "日" + getWeek(dayOfWeek));
    }

    public static String getWeek(int index) {
        String[] week = {"", "周日", "周一", "周二", "周三", "周四", "周五", "周六"};
        return week[index];
    }
}
