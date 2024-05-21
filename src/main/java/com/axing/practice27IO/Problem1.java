package com.axing.practice27IO;

import java.io.*;

/**
 * @projectName: test1
 * @package: com.axing.practice27IO
 * @className: Problem1
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/8 上午10:51
 * @version: 1.0
 */
public class Problem1 {
    public static void main(String[] args) throws IOException {
        // 使用字节流的四种方式进行拷贝测速
        long begin = System.currentTimeMillis();
        method1();  // 太久了，超两分钟了都快。。。
//        method2();  //0.117秒
//        method3();  //2.76秒
//        method4();  //0.115秒


        long end = System.currentTimeMillis();
        System.out.println((end - begin) / 1000.0 + "秒");

    }

    // 字节流  每次一个比特
    public static void method1() throws IOException {
        FileInputStream fis = new FileInputStream("E:\\IDEAProject\\test1\\aaa\\PlantsVsZombies_CN.exe");
        FileOutputStream fos = new FileOutputStream("E:\\IDEAProject\\test1\\aaa\\target.exe");
        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }
        fos.close();
        fis.close();

    }

    // 字节流  每次一组比特
    public static void method2() throws IOException {
        FileInputStream fis = new FileInputStream("E:\\IDEAProject\\test1\\aaa\\PlantsVsZombies_CN.exe");
        FileOutputStream fos = new FileOutputStream("E:\\IDEAProject\\test1\\aaa\\target.exe");
        int len;
        byte[] bytes = new byte[1024 * 1024 * 8];// 8mb cache
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        fos.close();
        fis.close();
    }

    // 字节缓冲流  每次一个比特
    public static void method3() throws IOException {
        FileInputStream fis = new FileInputStream("E:\\IDEAProject\\test1\\aaa\\PlantsVsZombies_CN.exe");
        FileOutputStream fos = new FileOutputStream("E:\\IDEAProject\\test1\\aaa\\target.exe");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int c;
        while ((c = bis.read()) != -1) {
            bos.write(c);
        }
        bos.close();
        bis.close();
    }

    // 字节缓冲流  每次一组比特
    public static void method4() throws IOException {
        FileInputStream fis = new FileInputStream("E:\\IDEAProject\\test1\\aaa\\PlantsVsZombies_CN.exe");
        FileOutputStream fos = new FileOutputStream("E:\\IDEAProject\\test1\\aaa\\target.exe");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int len;
        byte[] bytes = new byte[1024 * 1024 * 8];// 8mb cache
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        bos.close();
        bis.close();
    }
}
