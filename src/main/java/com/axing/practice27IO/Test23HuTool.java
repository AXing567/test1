package com.axing.practice27IO;

import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @projectName: test1
 * @package: com.axing.practice27IO
 * @className: Test23HuTool
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/9 下午3:52
 * @version: 1.0
 */
public class Test23HuTool {
    public static void main(String[] args) {
        File file = FileUtil.file("E:\\IDEAProject\\test1\\aaa", "aab", "bbb", "a.txt");
        System.out.println(file);

        FileUtil.touch("E:\\IDEAProject\\test1\\aaa", "HuToolTest.txt");
        ArrayList<String> list = new ArrayList<>();
        list.add("hello世界");
        list.add("hello世界");
        list.add("hello世界");
        list.add("hello世界");
        list.add("吼吼吼");
        FileUtil.writeLines(list, file, "UTF-8");


        ArrayList<String> list2 = new ArrayList<>();
        list2.add("续写");
        list2.add("续写");
        list2.add("续写");
        FileUtil.appendLines(list2, file, "UTF-8");

        List<String> list3 = FileUtil.readLines(file, "UTF-8");
//        list3.forEach(System.out::println);

        List<String> list4 = FileUtil.readUtf8Lines(file);
        list4.forEach(System.out::println);

        FileUtil.copy(file, new File("E:\\IDEAProject\\test1\\aaa\\HuToolTest.txt"), true);

    }
}
