package com.axing.practice30Net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * @projectName: test1
 * @package: com.axing.practice30Net
 * @className: Test2SendMessage
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/21 下午3:40
 * @version: 1.0
 */
public class Test2SendMessage {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入要发送的信息：");
            String line = sc.nextLine();
            byte[] bytes = line.getBytes(StandardCharsets.UTF_8);
            InetAddress ia = InetAddress.getByName("127.0.0.1");
            int port = 10086;
            DatagramPacket dp = new DatagramPacket(bytes, 0, bytes.length, ia, port);
            ds.send(dp);
        }



    }
}
