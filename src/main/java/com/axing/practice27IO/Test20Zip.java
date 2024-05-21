package com.axing.practice27IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * @projectName: test1
 * @package: com.axing.practice27IO
 * @className: Test20Zip
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/9 上午9:49
 * @version: 1.0
 */
public class Test20Zip {
    public static void main(String[] args) throws IOException {
        // 压缩流的练习
        File source = new File("E:\\IDEAProject\\test1\\aaa.zip");
        File dest = new File("D:");
        unZip(source, dest);
    }

    public static void unZip(File source, File dest) throws IOException {
        // 定义解压流
        ZipInputStream zis = new ZipInputStream(new FileInputStream(source), Charset.forName("GBK"));
        // 获得每个zipEntry对象
        ZipEntry ze;
        while ((ze = zis.getNextEntry()) != null) {
            System.out.println(ze);
            // 判断类型,创建目录或文件
            if (ze.isDirectory()) {
                File file = new File(dest, ze.toString());
                file.mkdir();
            } else {
                File file = new File(dest, ze.toString());
                FileOutputStream fos = new FileOutputStream(file);
                int len;
                byte[] bytes = new byte[1024 * 1024 * 8];
                while ((len = zis.read(bytes)) != -1) {
                    fos.write(bytes, 0, len);
                }
                fos.close();
                zis.closeEntry();
            }
        }
        // 关闭流
        zis.close();
    }
}
