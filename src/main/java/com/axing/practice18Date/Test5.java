package com.axing.practice18Date;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Test5 {
    public static void main(String[] args) {
        LocalDateTime birthday = LocalDateTime.of(2002, 2, 22, 8, 0, 0, 0);
        LocalDateTime now = LocalDateTime.now();

        System.out.println("相差年数：" + ChronoUnit.YEARS.between(birthday,now));
        System.out.println("相差月数：" + ChronoUnit.MONTHS.between(birthday,now));
        System.out.println("相差天数：" + ChronoUnit.DAYS.between(birthday,now));
        System.out.println("相差小时数：" + ChronoUnit.HOURS.between(birthday,now));
        System.out.println("相差分钟数：" + ChronoUnit.MINUTES.between(birthday,now));
        System.out.println("相差秒数：" + ChronoUnit.SECONDS.between(birthday,now));
        System.out.println("相差纳秒数：" + ChronoUnit.NANOS.between(birthday,now));

    }
}
