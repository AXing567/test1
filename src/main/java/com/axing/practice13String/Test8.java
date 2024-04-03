package com.axing.practice13String;

/**
 * @projectName: test1
 * @package: com.axing.practice13String
 * @className: Test8
 * @author: Axing
 * @description: 定义一个方法，
 * 把 int 数组中的数据按照指定的格式拼接成一个字符串返回，
 * 调用该方法，并在控制台输出结果。
 * 要求：
 * 1、如果传递的参数为空，返回null
 * 2、如果传递的数组元素个数为0，返回[]
 * 3、如果数组为int[] arr = {1,2,3}; ，执行方法后的输出结果为：[1, 2, 3]
 * @date: 2024/3/29 11:01
 * @version: 1.0
 */
public class Test8 {
    public static void main(String[] args) {
        // 定义int数组
        int[] arr = {1, 2, 3};
        // 调用方法把数组按照格式返回
        String result = arrFormatToString(arr);
        // 输出转换后的字符串
        System.out.println("转换后的字符串为：");
        System.out.println(result);

    }

    public static String arrFormatToString(int[] arr) {
        // 判断是否为空
        if (arr == null) return null;
        // 检查元素个数，判断是否为0 ，如果为0则返回"[]"
        int num = arr.length;
        if (num == 0) {
            return "[]";
        }
        // 遍历数组，将每个值都追加到StringBuilder中
        // 在循环的开始和结尾添加"["   "]"   中间使用", "作为分割
        // 已经实现此功能的类为StringJoiner的构造方法
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]).append("]");
            } else {
                sb.append(arr[i]).append(", ");
            }
        }
        return sb.toString();
    }
}
