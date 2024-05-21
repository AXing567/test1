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
 * @className: Test21Zip
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/9 上午10:22
 * @version: 1.0
 */
public class Test21Zip {
    public static void main(String[] args) throws IOException {
        // 压缩流的练习——————将文件压缩
        File source = new File("E:\\IDEAProject\\test1\\src\\main\\java\\com\\axing\\practice27IO\\UTF8txt.txt");
        File dest = new File("E:\\IDEAProject\\test1\\src\\main\\java\\com\\axing\\practice27IO");
        toZip(source,dest);
    }

    private static void toZip(File source, File dest) throws IOException {
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest,"UTF8txt.zip")));
        ZipEntry ze = new ZipEntry("UTF8txt.txt");
        zos.putNextEntry(ze);
        FileInputStream fis = new FileInputStream(source);
        int len;
        byte[] bytes = new byte[1024 * 1024 * 8];
        while ((len = fis.read(bytes)) != -1){
            zos.write(bytes,0,len);
        }
        fis.close();
        zos.close();



    }

}
