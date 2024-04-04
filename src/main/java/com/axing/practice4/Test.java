package com.axing.practice4;

import java.util.LinkedList;
import java.util.List;

/**
 * @projectName: test1
 * @package: com.axing.practice4
 * @className: Test
 * @author: Axing
 * @description: TODO
 * @date: 2024/3/24 11:32
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        List<Student> list = new LinkedList<Student>();
        list.add(new Student("刘德华", 85));
        list.add(new Student("张学友", 100));
        list.add(new Student("刘杰", 65));
        list.add(new Student("章子怡", 58));
        list.add(new Student("刘杰", 65));
        list.add(new Student("刘杰", 65));
        list.add(new Student("刘杰", 65));
        list.add(new Student("刘德华", 85));
        list.add(new Student("刘德华", 85));
        list.add(new Student("刘德华", 85));
        list.add(new Student("刘德华", 85));
        list.add(new Student("刘德华", 85));
        list.add(new Student("周迅", 76));

        System.out.println("LinkList中的个数为：" + list.size());
        // 删除刘杰并输出已有
        // 考虑到制定循环次数删除会漏，故采用这种办法
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getName().equals("刘杰")) {
                    list.remove(list.get(i));
                    flag = true;
                    break;
                }
            }
        }
        for (Student stu : list) {
            System.out.println(stu);
        }


        // 刘德华的成绩改为95并输出所有
        flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getName().equals("刘德华")) {
                    list.remove(list.get(i));
                    flag = true;
                    break;
                }
            }
        }
        list.add(new Student("刘德华", 95));
        System.out.println("---------------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 输出成绩不合格的学生
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getScore() < 60) {
                System.out.println(list.get(i).getName() + "成绩不合格");
            }
        }
    }
}
