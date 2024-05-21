package com.axing.practice27IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @projectName: test1
 * @package: com.axing.practice27IO
 * @className: Test16
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/8 下午7:55
 * @version: 1.0
 */
public class Test16 {
    public static void main(String[] args) throws IOException {
        // 序列化流 练习  序列化流是高级流  是基础流的包装流
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("E:\\IDEAProject\\test1\\src\\main\\java\\com\\axing\\practice27IO\\a.txt"));
        Student s = new Student("张三",20);
        oos.writeObject(s);
        oos.close();
    }
}
