package com.axing.practice13String;

/**
 * @projectName: test1
 * @package: com.axing.practice13String
 * @className: Test9
 * @author: Axing
 * @description: 在String类的API中，有如下两个方法：
 * <p>
 * // 查找参数字符串str在调用方法的字符串中第一次出现的索引，如果不存在，返回-1
 * public int indexOf(String str)
 * <p>
 * // 截取字符串，从索引beginIndex（包含）开始到字符串的结尾
 * public String substring(int beginIndex)
 * 请仔细阅读API中这两个方法的解释，完成如下需求。
 * <p>
 * 现有如下文本："Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的"。
 * 请编写程序，统计该文本中"Java"一词出现的次数。
 * @date: 2024/3/29 11:15
 * @version: 1.0
 */
public class Test9 {
    public static void main(String[] args) {
        String str = "Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的(Java)Jacva";
        String findStr = "Java";
        int sum = 0;
        int index;
        while (true) {
            // 找到Java出现的位置
            index = str.indexOf(findStr);
            if (index >= 0) {
                // 删除该位置的Java
                str = str.substring(index + findStr.length());
                sum++;
            } else break;
        }

        System.out.println("总共有" + sum + "个" + findStr);
    }
}
