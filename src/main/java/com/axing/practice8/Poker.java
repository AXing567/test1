package com.axing.practice8;

/**
 * @projectName: test1
 * @package: com.axing.practice8
 * @className: Poker
 * @author: Axing
 * @description: 扑克类(每张扑克有花色和数值 ， 例如红心A, 草花10), 将52张扑克牌放到集合中(自己去选择集合类)
 * @date: 2024/3/24 16:36
 * @version: 1.0
 */
public class Poker implements Comparable<Poker> {
    // 扑克花色 3：方块  2：草花  1：红心  0：黑桃
    private int color;
    // 3-10:3-10  J:11  Q:12  K:13  A:14  2:15
    private int num;

    public Poker() {
    }

    public Poker(int color, int num) {
        this.color = color;
        this.num = num;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        // 判定扑克花色
        String colorName;
        if (color == 0) {
            colorName = "黑桃";
        } else if (color == 1) {
            colorName = "红桃";
        } else if (color == 2) {
            colorName = "草花";
        } else {
            colorName = "方片";
        }
        // 判定扑克点数
        String numName;
        if (num >= 3 && num <= 10) {
            numName = num + "";
        } else if (num == 11) {
            numName = "J";
        } else if (num == 12) {
            numName = "Q";
        } else if (num == 13) {
            numName = "K";
        } else if (num == 14) {
            numName = "A";
        } else {
            numName = "2";
        }
        return colorName + numName;
    }

    @Override
    public int compareTo(Poker o) {
        // 比较数值
        if (this.getNum() < o.getNum()) {
            return -1;
        } else if (this.getNum() > o.getNum()) {
            return 1;
        } else {
            // 比较花色
            return Integer.compare(this.getColor(), o.getColor());
        }


    }
}
