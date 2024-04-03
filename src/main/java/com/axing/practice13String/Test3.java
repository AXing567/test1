package com.axing.practice13String;

import java.util.Scanner;

/**
 * @projectName: test1
 * @package: com.axing.practice13String
 * @className: Test3
 * @author: Axing
 * @description: 数字转为发票上的大写金额
 * @date: 2024/3/28 11:38
 * @version: 1.0
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //计算数值长度
        int length = 0;
        int num = sc.nextInt();
        int temp = num;
        while (temp > 0) {
            temp = temp / 10;
            length++;
        }
        // 小写转大写
        String result = toUpper(num);
        System.out.println("大写金额为：" + result);
        // 判断是否大于7位
        while(true){
            if (length > 7) {
                System.out.println("金额太大，无法转换，请重新输入：");
                num = sc.nextInt();
                temp = num;
                length = 0;
                while (temp > 0) {
                    temp = temp / 10;
                    length++;
                }
            } else {
                // 如果小于7位，补零
                for (int i = 0; i < 7 - length; i++) {
                    result = "零" + result;
                }
                System.out.println("补零后:" + result);
                // 插入单位
                System.out.println(insertUnit(result));
                break;
            }
        }


    }

    /**
     * @param num:
     * @return String
     * @author Axing
     * @description 小写数字转大写的方法
     * @date 2024/3/28 17:33
     */
    public static String toUpper(int num) {
        String[] str = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        String result = "";
        while (num > 0) {
            int a = num % 10;
            num = num / 10;
            result = str[a] + result;
        }
        return result;
    }

    /**
     * @param str:
     * @return String
     * @author Axing
     * @description 插入金额单位
     * @date 2024/3/28 17:54
     */
    public static String insertUnit(String str) {
        String[] unit = {"佰", "拾", "万", "仟", "佰", "拾", "元"};
        String result = "";
        for (int i = 0; i < unit.length; i++) {
            // 不断的把新数据插在尾部
            result = result + str.charAt(i) + unit[i];
        }
        return result;
    }
}
