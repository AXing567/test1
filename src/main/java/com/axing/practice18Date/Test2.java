package com.axing.practice18Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {
    public static void main(String[] args) throws ParseException {
        String dateStr = "2000-11-11";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(dateStr);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        String dateFormatStr = sdf2.format(date);
        System.out.println(dateFormatStr);
    }
}
