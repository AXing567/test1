package com.axing.StudentManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @projectName: test1
 * @package: com.axing.StudentManagementSystem
 * @className: StudentSystem
 * @author: Axing
 * @description: TODO
 * @date: 2024/3/29 21:06
 * @version: 1.0
 */
public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<Student> stuList = new ArrayList<Student>();
        loop:
        while (true) {
            System.out.println("-------------欢迎来到黑马学生管理系统----------------");
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");
            System.out.println("请输入您的选择:");
            Scanner sc = new Scanner(System.in);
            String choice = sc.next();
            switch (choice) {
                case "1" -> addStudent(stuList);
                case "2" -> delStudent(stuList);
                case "3" -> updateStudent(stuList);
                case "4" -> queryStudent(stuList);
                case "5" -> {
                    System.out.println("退出");
                    break loop;
                }
                default -> System.out.println("输入有误，请重新输入");

            }
        }
    }

    public static void addStudent(ArrayList<Student> stuList) {
        System.out.println("添加学生");
        // 键入学生信息
        Scanner sc = new Scanner(System.in);
        String id = null;
        while (true) {
            System.out.println("请输入学生id");
            id = sc.next();
            // 验证id是否唯一
            if (containsId(stuList, id)) {
                System.out.println("id不唯一，请重新输入");
            } else {
                break;
            }
        }
        System.out.println("请输入学生姓名");
        String name = sc.next();

        System.out.println("请输入学生年龄");
        int age = sc.nextInt();

        System.out.println("请输入学生地址");
        String address = sc.next();

        // 将学生添加到列表中
        Student stu = new Student(id, name, age, address);
        stuList.add(stu);

        // 输出添加成功
        System.out.println("添加成功！");

    }

    public static void delStudent(ArrayList<Student> stuList) {
        System.out.println("删除学生");
        // 录入要删除的学生的id
        System.out.println("请输入学生id");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        // id存在则删除
        int index = indexId(stuList, id);
        if (index >= 0) {
            stuList.remove(index);
            System.out.println("删除成功!");
            return;
        }

        // id不存在则提示不存在，回到初始菜单
        if (index == -1) {
            System.out.println("id不存在！");
        }

    }

    public static void updateStudent(ArrayList<Student> stuList) {
        System.out.println("修改学生");

        // 录入要修改的id
        System.out.println("请输入要修改的id：");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        // 检查id是否存在，存在则录入其他信息
        int index = indexId(stuList, id);
        String name;
        int age;
        String address;
        if (index >= 0) {
            System.out.println("请输入学生姓名");
            name = sc.next();

            System.out.println("请输入学生年龄");
            age = sc.nextInt();

            System.out.println("请输入学生地址");
            address = sc.next();

            Student stu = new Student(id, name, age, address);
            stuList.set(index, stu);

            System.out.println("录入成功！");
        } else {
            // 检查id是否存在，不存在则提示不存在并回到初始菜单
            System.out.println("id不存在!");
        }
    }

    public static void queryStudent(ArrayList<Student> stuList) {
        System.out.println("查询学生");
        if (stuList.size() == 0) {
            System.out.println("当前无学生信息，请添加后再查询");
            return;
        }

        System.out.println("id\t\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < stuList.size(); i++) {
            Student stu = stuList.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
        }

    }

    public static boolean containsId(ArrayList<Student> stuList, String id) {
        return indexId(stuList, id) >= 0;
    }

    public static int indexId(ArrayList<Student> stuList, String id) {
        for (int i = 0; i < stuList.size(); i++) {
            if (stuList.get(i).getId().equals(id))
                return i;
        }
        return -1;

    }


}
