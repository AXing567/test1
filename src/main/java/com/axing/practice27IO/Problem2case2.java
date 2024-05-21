package com.axing.practice27IO;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

/**
 * @projectName: test1
 * @package: com.axing.practice27IO
 * @className: Problem2case2
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/8 上午11:18
 * @version: 1.0
 */
public class Problem2case2 {
    public static void main(String[] args) throws IOException {
        // 将出师表进行排序后输出

        // 输入出师表的所有内容
        BufferedReader br = new BufferedReader(new FileReader("aaa/出师表.txt"));
        int c;
        String line;
        TreeMap<Integer, String> map = new TreeMap<>();
        while ((line = br.readLine()) != null) {
            map.put(Integer.parseInt(line.split("\\.")[0]),line);
        }
        // 排序出师表  // 已经通过TreeMap进行了排序

        // 将出师表进行输出
        BufferedWriter bw = new BufferedWriter(new FileWriter("aaa/出师表-排序后.txt"));
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            bw.write(entry.getValue());
            bw.newLine();
        }
        bw.close();
        br.close();
    }

}
