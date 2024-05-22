package com.axing.practice30Net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @projectName: test1
 * @package: com.axing.practice30Net
 * @className: Test4Server
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/21 下午4:50
 * @version: 1.0
 */
public class Test4Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);

        Socket socket = ss.accept();
        InputStream is = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        socket.close();
        ss.close();


    }
}
