package com.axing.practice27IO;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * @projectName: test1
 * @package: com.axing.practice27IO
 * @className: Problem2case1
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/8 上午11:18
 * @version: 1.0
 */
public class Problem2case1 {
    public static void main(String[] args) throws IOException {
        // 将出师表进行排序后输出

        // 输入出师表的所有内容
        BufferedReader br = new BufferedReader(new FileReader("aaa/出师表.txt"));
        int c;
        String line;
        ArrayList<String> csb = new ArrayList<String>();
        while ((line = br.readLine()) != null) {
            csb.add(line);
        }
        // 排序出师表
        csb.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i1 = Integer.parseInt(o1.split("\\.")[0]);
                int i2 = Integer.parseInt(o2.split("\\.")[0]);
                return i1 - i2;
            }
        });
        // 将出师表进行输出
        BufferedWriter bw = new BufferedWriter(new FileWriter("aaa/出师表-排序后"));
        for (String s : csb) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
        br.close();
    }

}
