package com.axing.practice13String;

/**
 * @projectName: test1
 * @package: com.axing.practice13String
 * @className: TestStringBuilder
 * @author: Axing
 * @description: TODO
 * @date: 2024/3/28 18:30
 * @version: 1.0
 */
public class TestStringBuilder {
    public static void main(String[] args) {
        // StringBuilder入门练习
        introductionTest();
        // 判断是否为对称字符串
        boolean sym = symmetry("112211");
        if (sym) {
            System.out.println("是对称字符串");
        } else {
            System.out.println("不是对称字符串");
        }
        // 数组变字符串练习 123 ——> [1, 2, 3]
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arrToString(arr));
    }

    public static String arrToString(int[] arr) {
        StringBuilder sb = new StringBuilder().append('[');
        // 不使用连字符，提高运行速度！节约内存空间！
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]).append("]");
            } else {
                sb.append(arr[i]).append(", ");
            }

        }
        return sb.toString();
    }

    public static boolean symmetry(String str) {
        StringBuilder sb = new StringBuilder(str);
        String reverse = sb.reverse().toString();
        if (str.equals(reverse)) {
            return true;
        } else {
            return false;
        }

    }

    public static void introductionTest() {
        StringBuilder sb = new StringBuilder("abc");
        System.out.println("原数据：" + sb);
        System.out.println(sb);

        System.out.println("追加数据后：");
        sb.append("123");
        sb.append(true);
        sb.append(456);
        System.out.println(sb);

        System.out.println("反转字符串并输出");
        System.out.println(sb.reverse());

        System.out.println("变为字符串：");
        String str = sb.toString();
        System.out.println(str);

    }

}
