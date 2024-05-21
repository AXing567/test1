package com.axing.practice27IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * @projectName: test1
 * @package: com.axing.practice27IO
 * @className: Test19
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/9 上午9:29
 * @version: 1.0
 */
public class Test19 {
    public static void main(String[] args) throws FileNotFoundException {
        // 字节打印流的练习
        PrintStream ps = new PrintStream(new FileOutputStream("E:\\IDEAProject\\test1\\src\\main\\java\\com\\axing\\practice27IO\\printStream.txt"));
        ps.print(97);
        ps.println(true);
        ps.printf("%s爱上了%d的%s","阿珍",20,"阿强");
        ps.close();
        // 字符打印流同理，只是字符打印流的自动刷新和手动刷新有区别，字节打印流的自动刷新和手动刷新没有区别

    }
}
