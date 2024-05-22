package com.axing.practice30Net.problem3;

import java.io.*;
import java.net.Socket;

/**
 * @projectName: test1
 * @package: com.axing.practice30Net.problem3
 * @className: Client
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/22 上午9:06
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 10; i++) {
            // 与服务器建立tcp链接
            Socket socket = new Socket("127.0.0.1", 10086);

            // 获取本地文件
            File file = new File("E:\\IDEAProject\\test1\\aaa\\PlantsVsZombies_CN.exe");
            // 创建本地的输入流和tcp的输出流
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
            BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
            // 将本地文件输出到管道中
            int len;
            byte[] bytes = new byte[1024 * 1024];
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
            // 传输结束后 标记关闭标记
            socket.shutdownOutput();

            // 接收服务器发来的信息（文字）
            InputStreamReader isr = new InputStreamReader(socket.getInputStream());
            int c;
            while ((c = isr.read()) != -1) {
                System.out.print((char) c);
            }
            // 关闭资源
            socket.close();
        }
    }
}
