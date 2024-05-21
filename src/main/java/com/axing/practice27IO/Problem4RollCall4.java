package com.axing.practice27IO;

import cn.hutool.core.io.FileUtil;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @projectName: test1
 * @package: com.axing.practice27IO
 * @className: Problem4RollCall1
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/10 上午8:09
 * @version: 1.0
 */
public class Problem4RollCall4 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> list2 = (ArrayList<String>) FileUtil.readUtf8Lines("E:\\IDEAProject\\test1\\src\\main\\java\\com\\axing\\practice27IO\\names.txt");
        Collections.shuffle(list2);
        // 创建第二个list
        ArrayList<String> list1 = new ArrayList<>();
        // 取出十名学生作为数据
        for (int i = 0; i < 10; i++) {
            list1.add(list2.get(i));
        }
        list2.removeAll(list2);
        for (int j = 0; j < 2; j++) {
            Collections.shuffle(list1);
            // 循环十次,每次输出一个并移动到list2中
            for (int i = 0; i < 10; i++) {
                String name = list1.getFirst().substring(0, 3);
                System.out.println(name);
                list2.add(list1.getFirst());
                list1.removeFirst();
            }
            // 循环结束后把list2的数据给到list1
            list1.addAll(list2);
            list2.removeAll(list2);
            // 完成上述步骤则可以开启第二轮循环
            System.out.println("-----------------------");
        }


    }
}
