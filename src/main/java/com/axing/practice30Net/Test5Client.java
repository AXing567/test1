package com.axing.practice30Net;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @projectName: test1
 * @package: com.axing.practice30Net
 * @className: Test5Client
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/21 下午5:00
 * @version: 1.0
 */
public class Test5Client {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1", 10086);
        OutputStream os = socket.getOutputStream();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String line = sc.nextLine();
        os.write(line.getBytes());
        os.close();
        socket.close();


    }
}
