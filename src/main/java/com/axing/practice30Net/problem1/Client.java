package com.axing.practice30Net.problem1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @projectName: test1
 * @package: com.axing.practice30Net.problem1
 * @className: Client
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/21 下午5:20
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10086);
        Scanner sc = new Scanner(System.in);
        OutputStream os = socket.getOutputStream();
        while (true) {
            System.out.println("请输入：");
            String line = sc.nextLine();
            if ("886".equals(line)) break;
            os.write(line.getBytes());
        }
        socket.close();
    }
}
