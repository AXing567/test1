package com.axing.practice26File;

import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Test3 {
    public static void main(String[] args) {
        //练习6：统计文件个数
        //需求：统计一个文件夹中每种文件的个数并打印。（考虑子文件夹） 打印格式如下： txt:3个 doc:4个 jpg:6个
        HashMap<String, Integer> map = countFile(new File("/home/ax/IdeaProjects/test1/aaa"));
        if (map != null) {
            map.entrySet().forEach(System.out::println);
        }
    }
    // aaa
    // aaa.txt
    // aaa.a.txt

    public static @Nullable HashMap<String, Integer> countFile(File f) {
        File[] files = f.listFiles();
        HashMap<String, Integer> map = new HashMap<>();
        if (files == null) return null;
        for (File file : files) {
            if (file.isFile()) {
                String[] fileName = file.getName().split("\\.");
                String format;
                // 将不同后缀添加到map中统计其个数
                if (fileName.length == 2) {
                    format = fileName[1];
                } else if (fileName.length == 1) {
                    continue;
                } else {
                    format = fileName[fileName.length - 1];
                }
                map.put(format, map.getOrDefault(format, 0) + 1);
            }else if (file.listFiles() != null){
                HashMap<String, Integer> tempMap = countFile(file);
                if (tempMap == null) continue;
                for (Map.Entry<String, Integer> entry : tempMap.entrySet()) {
                    map.put(entry.getKey(), map.getOrDefault(entry.getKey(), 0) + entry.getValue());
                }
            }
        }
        return map;
    }
}
