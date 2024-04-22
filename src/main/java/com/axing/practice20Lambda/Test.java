package com.axing.practice20Lambda;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        // 给宠物数组排序，按照岁数，颜色，名字顺序排序
        Animal animal1 = new Animal(1, "blue", "dogDiandian");
        Animal animal2 = new Animal(1, "white", "catMiaosang");
        Animal animal3 = new Animal(4, "black", "dogXiaobai");
        Animal animal4 = new Animal(3, "orange", "dogDiandian");
        Animal[] animals = {animal1, animal2, animal3, animal4};

        Arrays.sort(animals,(Animal a1, Animal a2) ->{
            double temp = a1.getAge() - a2.getAge();
            temp = temp == 0 ? a1.getColor().compareTo(a2.getColor()) : temp;
            temp = temp == 0 ? a1.getName().compareTo(a2.getName()) : temp;
            if (temp > 0){
                return 1;
            }else if(temp < 0){
                return -1;
            }else {
                return 0;
            }

            }
        );
        System.out.println(Arrays.toString(animals));
    }
}

class Animal {
    private int age;
    private String color;
    private String name;

    public Animal() {
    }

    public Animal(int age, String color, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
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

    public String toString() {
        return "Animal{age = " + age + ", color = " + color + ", name = " + name + "}";
    }
}
