package com.axing.practice21Generics;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<PersianCat> cats = new ArrayList<>();
        keepPet(cats);
    }
    public static void keepPet(ArrayList<? extends Cat> list){
        for (Cat cat : list) {

        }
    }
}
interface Eat{
    public void eat();
}
class Animal{
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Animal{name = " + name + ", age = " + age + "}";
    }
}
class Cat extends Animal {
    public Cat(String name, int age) {
        super(name,age);
    }

    public Cat() {
    }

}
class PersianCat extends Cat implements Eat{
    @Override
    public void eat() {
        System.out.println("一只叫做" + getName() + "的" + getAge() + "岁的波斯猫，正在吃东西");
    }

    public PersianCat(String name , int age) {
        super(name,age);
    }

}
class dragonLi extends Cat implements Eat{
    public dragonLi(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("一只叫做" + getName() + "的" + getAge() + "岁的狸花猫，正在吃东西");

    }
}
class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public String toString() {
        return "Dog{}";
    }
}
class TeddyDog extends Dog implements Eat {
    @Override
    public void eat() {
        System.out.println("一只叫做" + getName() + "的" + getAge() + "岁的泰迪，正在吃东西");

    }

    public TeddyDog() {
    }

    public TeddyDog(String name, int age) {
        super(name, age);
    }
}
class HuskyDog extends Dog implements Eat{
    @Override
    public void eat() {
        System.out.println("一只叫做" + getName() + "的" + getAge() + "岁的哈士奇，正在吃东西");

    }

    public HuskyDog() {
    }

    public HuskyDog(String name, int age) {
        super(name, age);
    }
}
