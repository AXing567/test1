package com.axing.practice30Net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.nio.charset.StandardCharsets;

/**
 * @projectName: test1
 * @package: com.axing.practice30Net
 * @className: Test3ReceiveMessage
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/21 下午3:40
 * @version: 1.0
 */
public class Test3ReceiveMessage {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);

        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, 0, bytes.length);
        while (true) {
            ds.receive(dp);
            byte[] data = dp.getData();
            int length = dp.getLength();
            String ip = dp.getAddress().getHostAddress();
            String hostName = dp.getAddress().getHostName();

            System.out.println("来自" + ip + "的" + hostName + "发来了:" + new String(data, 0, length, StandardCharsets.UTF_8));
        }
    }
}
