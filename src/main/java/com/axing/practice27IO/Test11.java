package com.axing.practice27IO;

import java.io.*;

/**
 * @projectName: test1
 * @package: com.axing.practice27IO
 * @className: Test11
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/7 下午4:23
 * @version: 1.0
 */
public class Test11 {
    public static void main(String[] args) throws IOException {
        // 加密文件及解密文件(通过异或一个数字进行加密或解密）
        long begin = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("E:\\IDEAProject\\test1\\aaa\\ency.jpg");
        FileOutputStream fos = new FileOutputStream("E:\\IDEAProject\\test1\\aaa\\deci.jpg");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        int c;
        while ((c = bis.read()) != -1) {
            bos.write(c ^ 100);
        }
        bos.close();
        bis.close();
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }
}
