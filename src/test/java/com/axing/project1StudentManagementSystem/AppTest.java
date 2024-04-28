package com.axing.project1StudentManagementSystem;


import java.util.ArrayList;

class AppTest {
    public static void main(String[] args) {
        getCode();
    }
    public static void getCode() {
        //自己练习
        ArrayList<Character> dictionaryList = new ArrayList<>();
        for (int i = 0; i < 26; i++)
            dictionaryList.add((char) ('a' + i));
        for (int i = 0; i < 26; i++)
            dictionaryList.add((char) ('A' + i));
        for (int i = 0; i < 10; i++)
            dictionaryList.add((char) ('0' + i));
        System.out.println(dictionaryList);
    }
}

