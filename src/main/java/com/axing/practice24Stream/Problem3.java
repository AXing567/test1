package com.axing.practice24Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem3 {
    public static ArrayList<Actor> actorArray = new ArrayList<Actor>();

    public static void main(String[] args) {
        // man
        ArrayList<String> listM = new ArrayList<>();
        Collections.addAll(listM, "张三，23", "李四啊，22", "王五，21", "赵六啊，20", "钱七，19", "周八啊，18");
        // woman
        ArrayList<String> listW = new ArrayList<>();
        Collections.addAll(listW, "杨三，23", "杨四，22", "杨五，21", "赵六，20", "钱七，19", "周八，18");

        Stream<String> stream1 = listM.stream()
                .limit(2)
                .filter(s -> s.split("，")[0].length() == 3);

        Stream<String> stream2 = listW.stream()
                .skip(1)
                .filter(s -> s.split("，")[0].startsWith("杨"));


//        Stream.concat(stream1, stream2)
//                .forEach(s -> actorArray.add(new Actor(s.split("，")[0]
//                        , Integer.parseInt(s.split("，")[1]))));
//        actorArray.forEach(System.out::println);


        List<Actor> collectList = Stream.concat(stream1, stream2)
                .map(s -> new Actor(s.split("，")[0], Integer.parseInt(s.split("，")[1])))
                .toList();

        System.out.println(collectList);


    }
}

class Actor {
    private String name;
    private Integer age;

    public Actor() {
    }

    public Actor(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString() {
        return "Actor{name = " + name + ", age = " + age + "}";
    }
}
