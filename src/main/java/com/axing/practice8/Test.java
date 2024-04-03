package com.axing.practice8;

import java.util.*;

/**
 * @projectName: test1
 * @package: com.axing.practice8
 * @className: Test
 * @author: Axing
 * @description: 编写一个扑克类(每张扑克有花色和数值 ， 例如红心A, 草花10), 将52张扑克牌放到集合中(自己去选择集合类)
 * 编写3个方法
 * 方法1.将集合中的所有扑克重新洗牌,并将扑克输出(打印出来即可)
 * 方法2.将集合中的所有扑克排序(按方块3~方块2,草花3~草花2, 红心3~红心2, 黑桃3~黑桃2的顺序排序)
 * 方法3：比较两张扑克牌的大小，如果版面的值相等，则按（黑桃->红心->草花->方块）的顺序进行排列
 * 测试以上方法
 * @date: 2024/3/24 16:35d
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        List<Poker> list = pokerRefresh();
        System.out.println("排序前：");
        showPokerByFour(list);
        System.out.println("排序后：");
        pokerSort(list);
        showPokerByFour(list);
        System.out.println("比较黑桃3和方片3的大小:");
        Poker p1 = new Poker(0, 3);
        Poker p2 = new Poker(0, 4);
        if (compareTwo(p1, p2) > 0) {
            System.out.println(p1 + "大于" + p2);
        } else if (compareTwo(p1, p2) < 0) {
            System.out.println(p1 + "小于" + p2);
        } else {
            System.out.println(p1 + "等于" + p2);
        }


    }

    /**
     * @param p1:
     * @param p2:
     * @return int  -1:p1小于p2 0:相等 1:p1大于p2
     * @author Axing
     * @description 比较两张扑克牌的大小，如果版面的值相等，则按（黑桃->红心->草花->方块）的顺序进行排列
     * @date 2024/3/24 17:46
     */
    public static int compareTwo(Poker p1, Poker p2) {
        return p1.compareTo(p2);
    }


    /**
     * @param :
     * @return List<Poker>
     * @author Axing
     * @description 创建扑克牌列表并洗牌
     * @date 2024/3/24 17:10
     */
    public static List<Poker> pokerRefresh() {
        // 创建扑克列表
        List<Poker> list = new ArrayList<>();
        // 分发新牌
        for (int i = 0; i < 52; i++) {
            list.add(new Poker(i / 13, i % 13 + 3));
        }
        // 洗牌
        Collections.shuffle(list);
        return list;

    }

    /**
     * @param list:
     * @return void
     * @author Axing
     * @description 分成四份显示扑克牌
     * @date 2024/3/24 17:04
     */
    public static void showPokerByFour(List<Poker> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).toString() + " ");
            if ((i + 1) % 13 == 0) System.out.println();
        }
    }

    /**
     * @param list:
     * @return List<Poker>
     * @author Axing
     * @description 将集合中的所有扑克排序(按方块3 ~ 方块2, 草花3 ~ 草花2, 红心3 ~ 红心2, 黑桃3 ~ 黑桃2的顺序排序)
     * @date 2024/3/24 17:14d
     */
    public static List<Poker> pokerSort(List<Poker> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    Poker poker = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, poker);
                }
            }
        }
        return list;
    }
}
