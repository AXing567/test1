package com.axing.practice12;

import java.util.Scanner;

/**
 * @projectName: test1
 * @package: com.axing.practice12
 * @className: Test
 * @author: Axing
 * @description: TODO
 * @date: 2024/3/27 20:43
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("张三", 18, 1);
        students[1] = new Student("李四", 19, 2);
        students[2] = new Student("王五", 20, 3);

        // 键入学生信息
        System.out.println("请输入学生的姓名、年龄、学号：");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        int studentId = sc.nextInt();
        // 判断学号是否重复
        boolean flag = true;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getStudentId() == studentId) {
                System.out.println("学号重复");
                flag = false;
                break;
            }
        }
        // 如果不重复则添加学生信息
        if (flag) {
            Student[] s = new Student[students.length + 1];
            for (int i = 0; i < students.length; i++) {
                s[i] = students[i];
            }
            students = s;
            students[students.length - 1] = new Student(name, age, studentId);
            System.out.println("添加成功");
        }
        // 遍历数组
        System.out.println("学生信息如下：");
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getAge() + " " + student.getStudentId());
        }

        // 通过id删除学生信息
        System.out.println("请输入要删除的学生学号：");
        int deleteId = sc.nextInt();
        for (int i = 0; i < students.length; i++) {
            if (students[i].getStudentId() == deleteId) {
                for (int j = i; j < students.length - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[students.length - 1] = null;
                System.out.println("删除成功");
                break;
            }
        }

        // 查询姓名为张三的学生信息，如果存在则年龄加1
        for (Student student : students) {
            if (student != null && student.getName().equals("张三")) {
                System.out.println("找到了");
                student.setAge(student.getAge() + 1);
            }
        }
        // 遍历数组
        for (Student student : students) {
            if (student != null) {
                System.out.println(student.getName() + " " + student.getAge() + " " + student.getStudentId());
            }
        }
    }
}
