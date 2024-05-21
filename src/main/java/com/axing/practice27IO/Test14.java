package com.axing.practice27IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * @projectName: test1
 * @package: com.axing.practice27IO
 * @className: Test14
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/8 下午5:16
 * @version: 1.0
 */
public class Test14 {
    public static void main(String[] args) throws IOException {
        // 指定字符编码读取文本并以utf8的格式输出

        FileReader fr = new FileReader("src/main/java/com/axing/practice27IO/GBKtxt.txt", Charset.forName("GBK"));
        FileWriter fw = new FileWriter("src/main/java/com/axing/practice27IO/UTF8txt.txt", StandardCharsets.UTF_8);
        int c;
        while ((c = fr.read()) != -1) {
            fw.write((char) c);
        }
        fw.close();
        fr.close();
    }
}
