package com.axing.practice9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @projectName: test1
 * @package: com.axing.practice9
 * @className: Test
 * @author: Axing
 * @description: 1） 计算所有学生的平均年龄
 * 2） 计算各个班级的平均分
 * @date: 2024/3/24 21:16
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Tom", 18, 100, "class05"));
        list.add(new Student("Jerry", 22, 70, "class04"));
        list.add(new Student("Owen", 25, 90, "class05"));
        list.add(new Student("Jim", 30, 80, "class05"));
        list.add(new Student("Steve", 28, 66, "class06"));
        list.add(new Student("Kevin", 24, 100, "class04"));

        // 计算所有学生的平均年龄
        double age = 0.0;
        for (int i = 0; i < list.size(); i++) {
            age += list.get(i).getScore();
        }
        System.out.println("所有学生的平均年龄为：" + Math.floor(age / list.size() * 100) / 100);


        // 计算各个班级的平均分
        // 将各个班级添加到集合中
        Set<String> set = new HashSet<>();
        for (Student stu : list) {
            set.add(stu.getClassNum());
        }

        for (String classNum : set) {
            double total = 0.0;
            int sum = 0;
            for (Student stu : list) {
                if (stu.getClassNum().equals(classNum)) {
                    total += stu.getScore();
                    sum++;
                }
            }
            System.out.println(classNum + "的平均分是" + total / sum);
        }


    }
}
