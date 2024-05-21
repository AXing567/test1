package com.axing.practice27IO;

import java.io.*;
import java.util.Arrays;

/**
 * @projectName: test1
 * @package: com.axing.practice27IO
 * @className: Test12
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/8 上午9:32
 * @version: 1.0
 */
public class Test12 {
    public static void main(String[] args) throws IOException {
        // 给文件中有格式的无序数字进行排序
        // 1-5-9-3-6-8

        // 从文件读取数据
        BufferedReader br = new BufferedReader(new FileReader("E:\\IDEAProject\\test1\\aaa\\numberSort.txt"));
        StringBuilder sb = new StringBuilder();
        int c;
        while ((c = br.read()) != -1) {
            sb.append((char) c);
        }
        // 将读取到的数据转化为数组并排序
        String[] split = sb.toString().split("-");
        Integer[] arr = Arrays.stream(split)
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);
        // 输出数组
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\IDEAProject\\test1\\aaa\\numberSorted.txt"));
        String res = Arrays.toString(arr).replaceAll(", ", "-");
        res = res.substring(1, res.length() - 1);
        bw.write(res);
        bw.close();
        br.close();
    }
}
