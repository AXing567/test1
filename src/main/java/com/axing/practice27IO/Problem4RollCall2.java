package com.axing.practice27IO;

import cn.hutool.core.io.FileUtil;

import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @projectName: test1
 * @package: com.axing.practice27IO
 * @className: Problem4RollCall1
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/10 上午8:09
 * @version: 1.0
 */
public class Problem4RollCall2 {
    public static void main(String[] args) throws FileNotFoundException {
        List<String> list = FileUtil.readUtf8Lines("E:\\IDEAProject\\test1\\src\\main\\java\\com\\axing\\practice27IO\\names.txt");
        Collections.shuffle(list);
        int num = 1000000;
        int b = 0, g = 0;
        Random rd = new Random();
        // 点num次名
        for (int i = 0; i < num; i++) {
            double r = rd.nextDouble(100);
            char sex = (r < 70.0 ? '男' : '女');
            if (i % list.size() == 0) Collections.shuffle(list);
            // 抽取指定性别的同学
            int j = rd.nextInt(list.size());
            while (list.get(j).charAt(4) != sex) {
                j = rd.nextInt(list.size());
            }
            // 统计不同性别出现的次数
            if (sex == '男') {
                b++;
            } else {
                g++;
            }
        }
        System.out.println(b);
        System.out.println(g);
    }
}
