package com.axing.practice24Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "zhangsan, 23", "lisi, 24", "wangwu, 25");
        // 保留年龄大于等于24的人，集合放置于map集合中，姓名为键，年龄为值

        Map<String, String> collectMap = list.stream().filter(s -> Integer.parseInt(s.split(", ")[1]) >= 24)
                .collect(Collectors.toMap(s -> s.split(", ")[0],
                        s -> s.split(", ")[1]));
        collectMap.forEach((key, val) -> System.out.println(key + ":" + val));
    }
}
