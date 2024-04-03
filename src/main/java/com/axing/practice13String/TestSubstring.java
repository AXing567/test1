package com.axing.practice13String;

/**
 * @projectName: test1
 * @package: com.axing.practice13String
 * @className: TestSubstring
 * @author: Axing
 * @description: substring练习
 * @date: 2024/3/28 17:59
 * @version: 1.0
 */
public class TestSubstring {
    public static void main(String[] args) {
        printPhoneNumber("12345678910");
        printIDCardInfo("123456200202221111");
    }

    /**
     * @param num:
     * @return void
     * @author Axing
     * @description 手机号码隐藏中间四位
     * @date 2024/3/28 18:07
     */
    public static void printPhoneNumber(String num) {
        String start = num.substring(0, 3);
        String end = num.substring(7, 11);
        System.out.println("隐藏中间四位后的手机号码为：");
        System.out.println(start + "****" + end);
    }

    /**
     * @param id:
     * @return void
     * @author Axing
     * @description 通过身份证号输出此人出生日期和性别
     * @date 2024/3/28 18:07
     */
    public static void printIDCardInfo(String id) {
        String birthDate = id.substring(6, 13);
        char gender = id.charAt(16);
        System.out.println("人物信息为：");
        System.out.println("出生日期为：" + birthDate);
        System.out.println("性别为：" + ((gender - 48) % 2 == 0 ? "女" : "男"));


    }
}
