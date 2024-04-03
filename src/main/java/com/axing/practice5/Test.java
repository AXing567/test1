package com.axing.practice5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @projectName: test1
 * @package: com.axing.practice5
 * @className: Test
 * @author: Axing
 * @description: TODO
 * @date: 2024/3/24 15:51
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        // 打乱list的顺序（通过随机的两两调换）并输出
        for (int i = 0; i < list.size(); i++) {
            int index1 = new Random().nextInt(list.size());
            int index2 = new Random().nextInt(list.size());
            int t = list.get(index1);
            list.set(index1, list.get(index2));
            list.set(index2, t);
        }
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        //冒泡排序，从小到大
        for (int i = 0; i < list.size() - 1; i++)
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int t = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, t);
                }
            }
        System.out.println();
        System.out.println("从小到大排序：");
        for(int i : list){
            System.out.print(i + " ");
        }
        //冒泡排序，从大到小
        for (int i = 0; i < list.size() - 1; i++)
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) < list.get(j + 1)) {
                    int t = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, t);
                }
            }
        System.out.println();
        System.out.println("从大到小排序：");
        for(int i : list){
            System.out.print(i + " ");
        }

    }
}
