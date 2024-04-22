package com.axing.practice16Interface;

public class Test2 {
    public static void main(String[] args) {
        TableTennisPlayer tp = new TableTennisPlayer("zhangsan", 24);
        BasketballPlayer bp = new BasketballPlayer("lisi", 25);
        TableTennisCoach tc = new TableTennisCoach("wangwu", 26);
        BasketballCoach bc = new BasketballCoach("zhangliu", 27);


    }
}

interface SpeakEnglish {
    void speakEnglish();
}

abstract class People {
    private String name;
    private int age;

    public People() {
    }

    public People(String name, int age) {
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

    public String toString() {
        return "People{name = " + name + ", age = " + age + "}";
    }
}

abstract class Member extends People {
    public Member() {
    }

    public Member(String name, int age) {
        super(name, age);
    }

    abstract public void learn();
}

class TableTennisPlayer extends Member implements SpeakEnglish {
    public TableTennisPlayer() {
    }

    public TableTennisPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("乒乓球学打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员讲英语");
    }
}

class BasketballPlayer extends Member {
    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("篮球运动员学打篮球");
    }
}

abstract class Coach extends People {
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    abstract public void Teach();
}

class TableTennisCoach extends Coach implements SpeakEnglish {
    public TableTennisCoach() {
    }

    public TableTennisCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void Teach() {
        System.out.println("乒乓球教练教学");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练讲英语");
    }
}

class BasketballCoach extends Coach {

    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void Teach() {
        System.out.println("篮球教练教打篮球");
    }
}

