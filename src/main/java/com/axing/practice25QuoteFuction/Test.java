package com.axing.practice25QuoteFuction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @projectName: test1
 * @package: com.axing.practice25QuoteFuction
 * @className: Test
 * @author: Axing
 * @description: TODO
 * @date: 2024/4/28 10:59
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        // 引用方法的练习
        //字符串列表转换为数字列表
        ArrayList<String> strList = new ArrayList<>();
        Collections.addAll(strList,"1","2","3","4","5","6","7","8");
        List<Integer> intList = strList.stream().map(Integer::parseInt).toList();
        intList.forEach(System.out::println);
    }
}
