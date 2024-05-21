package com.axing.practice27IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @projectName: test1
 * @package: com.axing.practice27IO
 * @className: Test17
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/8 下午8:03
 * @version: 1.0
 */
public class Test17 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 反序列化流的练习
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("E:\\IDEAProject\\test1\\src\\main\\java\\com\\axing\\practice27IO\\a.txt"));

        Object o = ois.readObject();
        System.out.println((Student) o);
        ois.close();
    }
}
