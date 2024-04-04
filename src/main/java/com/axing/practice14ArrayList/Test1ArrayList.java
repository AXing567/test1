package com.axing.practice14ArrayList;

import java.util.ArrayList;

/**
 * @projectName: test1
 * @package: com.axing.practice14ArrayList
 * @className: Test1ArrayList
 * @author: Axing
 * @description: TODO
 * @date: 2024/3/29 20:32
 * @version: 1.0
 */
public class Test1ArrayList {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student("1", "张三", "123"));
        al.add(new Student("2", "李四", "123"));
        al.add(new Student("3", "王五", "123"));

        // 调用方法 存在指定id则返回索引，反之返回-1
        System.out.println(findById(al, "3"));
    }

    public static int findById(ArrayList<Student> al, String id) {
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
