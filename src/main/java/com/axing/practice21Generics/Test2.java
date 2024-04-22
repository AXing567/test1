package com.axing.practice21Generics;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Ye> al1 = new ArrayList<>();
        ArrayList<Fu> al2 = new ArrayList<>();
        ArrayList<Zi> al3 = new ArrayList<>();
        ArrayList<Stu> al4 = new ArrayList<>();

        test(al1);
        test(al2);
        test(al3);
        test(al4);

        test2(al1);
        test2(al2);
        test2(al3);
        test2(al4);

        test3(al1);
//        test3(al2); // 报错
//        test3(al3); // 报错
//        test3(al4); // 报错

        test4(al1);
        test4(al2);
        test4(al3);
//        test4(al4); // 报错


    }


    public static<E> void test(ArrayList<E> list){}
    public static void test2(ArrayList<?> list){}
    public static void test3(ArrayList<Ye>  list){}
    public static void test4(ArrayList<? extends Ye> list){}
}


class Ye{}
class Fu extends Ye{}
class Zi extends Fu{}
class Stu{}
