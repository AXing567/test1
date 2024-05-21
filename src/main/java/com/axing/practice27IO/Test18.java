package com.axing.practice27IO;

import java.io.*;
import java.util.ArrayList;

/**
 * @projectName: test1
 * @package: com.axing.practice27IO
 * @className: Test18
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/8 下午8:33
 * @version: 1.0
 */
public class Test18 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 多个对象进行序列化和反序列化的练习
        // 序列化
        serialize();
        // 反序列化
        deserialize();
    }

    public static void serialize() throws IOException {
        // 多个对象进行序列化
        Student s1 = new Student("张三", 21, "北京");
        Student s2 = new Student("张二", 22, "北京");
        Student s3 = new Student("张一", 23, "北京");
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("E:\\IDEAProject\\test1\\src\\main\\java\\com\\axing\\practice27IO\\多个对象的序列化.txt"));
        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        oos.writeObject(students);
        oos.close();
    }

    public static void deserialize() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("E:\\IDEAProject\\test1\\src\\main\\java\\com\\axing\\practice27IO\\多个对象的序列化.txt"));
        ArrayList<Student> students = (ArrayList<Student>) ois.readObject();
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
