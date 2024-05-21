package com.axing.practice27IO;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @projectName: test1
 * @package: com.axing.practice27IO
 * @className: Test24Crawling
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/9 下午9:09
 * @version: 1.0
 */
public class Test24Crawling {
    public static void main(String[] args) throws IOException {
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?from=aladdin&pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d";
        String boyNameNet = "http://mingzi.jb51.net/qiming/nanhai/68814860866.html";
        String girlNameNet = "https://zhuanlan.zhihu.com/p/164506772";


        // 从链接中获取所有字符（未筛选
        String familyNameTemp = getCharAll(familyNameNet);//赵钱孙李，周吴郑王。
        String boyNameTemp = getCharAll(boyNameNet);//1.昊玉、新梁、纬博、君临、瑾平
        String girlNameTemp = getCharAll(girlNameNet);//【怡雯】【蕾雅】【雪娟】

        // 将字符进行初步筛选
        ArrayList<String> familyNameTempList = getName(familyNameTemp, "([\\u4E00-\\u9FA5]{4})(，|。)", 1);

        // 将字符进行最后的筛选
        ArrayList<String> boyNameList = getName(boyNameTemp, "\\d\\.[\\u4E00-\\u9FA5]{2}(、[\\u4E00-\\u9FA5]{2}){4}", 0);
        boyNameList = getName(boyNameList.toString(), "((\\d\\.)|(、))([\\u4E00-\\u9FA5]{2})", 4);
        ArrayList<String> girlNameList = getName(girlNameTemp, "(【)([\\u4E00-\\u9FA5]{2})(】)", 2);
        ArrayList<String> familyNameList = new ArrayList<>();
        for (String s : familyNameTempList) {
            for (int i = 0; i < s.length(); i++) {
                familyNameList.add(s.charAt(i) + "");
            }
        }
        // 拼接姓名到一个集合中，每个元素格式为：姓名-性别-年龄   可以指定男生和女生生成的数量  要求姓名不重复
        ArrayList<String> list = getInfos(familyNameList, boyNameList, girlNameList, 70, 20);
        Collections.shuffle(list);
        // 将数据写入到names文件中
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("E:\\IDEAProject\\test1\\src\\main\\java\\com\\axing\\practice27IO\\names.txt")));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();


    }

    /**
     * @param fnl:     familyNameList
     * @param bnl:     boyNameList
     * @param gnl:     girlNameList
     * @param boyNum:
     * @param girlNum:
     * @return ArrayList<String>
     * @author Axing
     * @description TODO
     * @date 2024/5/9 下午5:59
     */
    private static ArrayList<String> getInfos(ArrayList<String> fnl, ArrayList<String> bnl, ArrayList<String> gnl, int boyNum, int girlNum) {
        // 生成男生名字
        HashSet<String> boySet = createAllName(fnl, bnl, boyNum);
        HashSet<String> girlSet = createAllName(fnl, gnl, girlNum);
        ArrayList<String> list = new ArrayList<>();
        Random rd = new Random();
        for (String s : boySet) {
            // 18 - 27岁
            int age = rd.nextInt(10) + 18;
            list.add(s + "-男-" + age);
        }
        for (String s : girlSet) {
            // 18 - 25岁
            int age = rd.nextInt(8) + 18;
            list.add(s + "-女-" + age);
        }
        return list;
    }

    private static HashSet<String> createAllName(ArrayList<String> fnl, ArrayList<String> nl, int num) {
        HashSet<String> peopleSet = new HashSet<>();
        while (true) {
            if (peopleSet.size() == num) {
                break;
            }
            Collections.shuffle(fnl);
            Collections.shuffle(nl);
            for (int i = 0; i < 5; i++) {
                peopleSet.add(fnl.get(i) + nl.get(i));
            }
        }
        return peopleSet;
    }

    private static ArrayList<String> getName(String str, String regex, int index) {
        ArrayList<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            list.add(matcher.group(index));
        }
        return list;


    }

    private static String getCharAll(String net) throws IOException {
        URL url = new URL(net);
        URLConnection conn = url.openConnection();
        InputStreamReader isr = new InputStreamReader(conn.getInputStream());
        StringBuilder sb = new StringBuilder();
        int len;
        char[] chars = new char[1024];
        while ((len = isr.read(chars)) != -1) {
            sb.append(chars, 0, len);
        }
        isr.close();
        return sb.toString();
    }
}
