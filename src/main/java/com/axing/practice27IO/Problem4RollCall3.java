package com.axing.practice27IO;

import cn.hutool.core.io.FileUtil;

import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;

/**
 * @projectName: test1
 * @package: com.axing.practice27IO
 * @className: Problem4RollCall1
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/10 上午8:09
 * @version: 1.0
 */
public class Problem4RollCall3 {
    public static void main(String[] args) throws FileNotFoundException {
        List<String> list = FileUtil.readUtf8Lines("E:\\IDEAProject\\test1\\src\\main\\java\\com\\axing\\practice27IO\\names.txt");
        Collections.shuffle(list);
        int num = 5;
        for (int i = 0; i < num; i++) {
            if (i == 2) {
                System.out.println("张三");
            } else {
                System.out.println(list.get(i).substring(0, 3));
            }

        }
    }
}
