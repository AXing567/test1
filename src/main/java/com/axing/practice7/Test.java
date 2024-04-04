package com.axing.practice7;

import java.util.*;

/**
 * @projectName: test1
 * @package: com.axing.practice7
 * @className: Test
 * @author: Axing
 * @description: 编写一个22选5的彩票选号程序。每次选出不同的五组号码，并输出到控制台中。
 * @date: 2024/3/24 16:25
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 22; i++) {
            list.add(i);
        }

        // 输出五组号码，每组五个号码
        for (int j = 1; j <= 5; j++) {
            // 打乱list的顺序（两两交换
            Random rd = new Random();
            for (int i = 0; i < list.size(); i++) {
                int index1 = rd.nextInt(list.size());
                int index2 = rd.nextInt(list.size());
                int number1 = list.get(index1);
                int number2 = list.get(index2);
                list.set(index1, number2);
                list.set(index2, number1);
            }
            // 输出打乱顺序后的前五个值
            System.out.println("第" + j + "组：");
            for (int k = 0; k < 5; k++) {
                System.out.print(list.get(k) + " ");
            }
            System.out.println();
        }


    }
}
