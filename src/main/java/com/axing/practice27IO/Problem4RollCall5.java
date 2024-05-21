package com.axing.practice27IO;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @projectName: test1
 * @package: com.axing.practice27IO
 * @className: Problem4RollCall1
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/10 上午8:09
 * @version: 1.0
 */
public class Problem4RollCall5 {
    public static void main(String[] args) throws IOException {
        // 带权重的随机点名，每次点到名字的同学下次点名被点到的概率减半

        // 获取每位同学的全部信息
        File file = new File("E:\\IDEAProject\\test1\\src\\main\\java\\com\\axing\\practice27IO\\names2.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        ArrayList<StudentWeight> swl = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            String[] arr = line.split("-");
            StudentWeight stu = new StudentWeight(arr[0], arr[1], Integer.parseInt(arr[2]), Double.parseDouble(arr[3]));
            swl.add(stu);
        }
        // 关闭资源
        br.close();

        // 获取总体权重
        double weight = 0;
        int num = 0;
        for (StudentWeight stu : swl) {
            num++;
            weight += stu.getWeight();
        }

        // 计算每个同学的权重占比    权重占比 = 个人权重 ÷ 权重总和
        double[] weightArr = new double[swl.size()];
        int index = 0;
        for (StudentWeight stu : swl) {
            double personWeightPercentage = stu.getWeight() / weight;
            weightArr[index++] = personWeightPercentage;
        }

        // 根据权重占比和随机数,判断点名同学
        for (int i = 1; i < weightArr.length; i++) {
            weightArr[i] += weightArr[i - 1];
        }
        double random = Math.random();
        int i = -Arrays.binarySearch(weightArr, random) - 1;

        // 点名后削减这位同学的个人权重
        System.out.println(swl.get(i).getName());
        swl.get(i).setWeight(swl.get(i).getWeight() / 2.0);
        // 写入数据
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        for (StudentWeight stu : swl) {
            bw.write(stu.toString());
            bw.newLine();
        }
        // 关闭资源
        bw.close();

    }
}
