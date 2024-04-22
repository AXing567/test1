package com.axing.practice21Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        GenericsTest<String> sgt = new GenericsTest<>();
        sgt.add("123");
        System.out.println(sgt);


        ArrayList<Integer> al = new ArrayList<>();
        GenericsTest2.addAll(al, 1, 2, 3, 4, 5);
        al.forEach(System.out::println);
    }
}

class GenericsTest<E> {
    Object[] arr = new Object[10];
    int i = 0;

    public boolean add(E e) {
        arr[i++] = e;
        return true;
    }

    public E get(int i) {
        return (E) arr[i];
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}

class GenericsTest2 {
    public static <E> void addAll(ArrayList<E> arr, E... e) {
        for (E e1 : e) {
            arr.add(e1);
        }
    }
}
