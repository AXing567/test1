package com.axing.practice30Net.problem1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @projectName: test1
 * @package: com.axing.practice30Net.problem1
 * @className: Server
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/21 下午5:20
 * @version: 1.0
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);

        while (true) {
            Socket socket = ss.accept();
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            int c;
            while ((c = br.read()) != -1) {
                System.out.print((char) c);
            }
            System.out.println();
        }
    }
}
