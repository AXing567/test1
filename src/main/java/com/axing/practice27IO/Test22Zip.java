package com.axing.practice27IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @projectName: test1
 * @package: com.axing.practice27IO
 * @className: Test22Zip
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/9 上午11:18
 * @version: 1.0
 */
public class Test22Zip {
    public static void main(String[] args) throws IOException {
        // 压缩一个文件夹

        // 创建源文件
        File src = new File("D:\\aaa");
        File parent = src.getParentFile();
        String name = src.getName();
        // 创建输出目标
        ZipOutputStream zof = new ZipOutputStream(new FileOutputStream(new File(parent, name + ".zip")));
        // 将所有文件解压到目标中
        toZip(src, zof, name);

        // 关闭资源
        zof.close();
    }
    /**
     * @param src:
     * @param zof:
     * @param name:
     * @return void
     * @author Axing
     * @description TODO
     * @date 2024/5/13 下午8:23
     */
    private static void toZip(File src, ZipOutputStream zof, String name) throws IOException {
        // 判断文件夹是否为空
        if (src.listFiles() == null) return;
        // 遍历文件夹里所有的文件
        for (File file : src.listFiles()) {
            // 如果是文件
            if (file.isFile()) {
                // 创建ZipEntry对象.
                ZipEntry entry = new ZipEntry(name + "\\" + file.getName());
                // 将ZipEntry对象放入zip输出流中
                zof.putNextEntry(entry);
                // 创建文件输入流
                FileInputStream fis = new FileInputStream(file);
                // 将文件写入到zip输出流中
                int len;
                byte[] bytes = new byte[1024 * 1024 * 8];
                while ((len = fis.read(bytes)) != -1) {
                    zof.write(bytes, 0, len);
                }
                // 关闭资源
                fis.close();
                zof.closeEntry();
            } else {
                // 如果是文件夹,递归调用本方法
                toZip(file, zof, name + "\\" + file.getName());
            }
        }
    }
}


















