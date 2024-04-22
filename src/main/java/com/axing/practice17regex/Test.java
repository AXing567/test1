package com.axing.practice17regex;

public class Test {
    public static void main(String[] args) {
        // 大小写字母，数字，下划线，一共4-16位
        String regex = "\\w{4,16}";
        System.out.println("145".matches(regex));

        String regex2 = "[1-9]\\d{16}[\\dXx]";
        System.out.println("23010720020222001X".matches(regex2));
        //2  30107   2002  02  22  001X
        String regex3 = "[1-9]\\d{5}(19\\d{2}|20\\d{2})(0[1-9]|1[0-2])(0[1-9]|[1-2]\\d|3[0-1])\\d{3}(\\d|x|X)";
        System.out.println("23010720020222001X".matches(regex3));


    }
}
