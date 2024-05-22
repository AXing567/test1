package com.axing.practice30Net.problem2;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * @projectName: test1
 * @package: com.axing.practice30Net.problem2
 * @className: Client
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/21 下午5:33
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) throws IOException {
        // 向服务器发送数据
        Socket socket = new Socket("127.0.0.1", 10086);

        OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
        OutputStream os = socket.getOutputStream();
        os.write("你好，服务器".getBytes());

        // 打一个结束标记
        socket.shutdownOutput();

        // 接收服务器发送的数据
        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        int c;
        while ((c = isr.read()) != -1){
            System.out.print((char) c);
        }
        System.out.println();

        // 关闭资源
        socket.close();

    }

}
