package com.axing.practice30Net.problem2;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @projectName: test1
 * @package: com.axing.practice30Net.problem2
 * @className: Server
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/21 下午5:33
 * @version: 1.0
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);

        Socket socket = ss.accept();

        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        int c;
        while ((c = isr.read()) != -1){
            System.out.print((char) c);
        }
        System.out.println();

        // 向客户端发送数据
        String s = "来自服务器的数据";
        OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
        OutputStream os = socket.getOutputStream();
        os.write(s.getBytes());

        socket.close();
        ss.close();

    }
}
