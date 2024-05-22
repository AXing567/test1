package com.axing.practice30Net.problem3;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

/**
 * @projectName: test1
 * @package: com.axing.practice30Net.problem3
 * @className: MyRunnable
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/22 上午9:46
 * @version: 1.0
 */
public class MyRunnable implements Runnable {
    Socket socket;

    public MyRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            // 创建客户端输入流  文件输出流
            String name = UUID.randomUUID().toString().replaceAll("-", "");
            File file = new File("E:\\IDEAProject\\test1\\bbb\\" + name + ".exe");
            BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
            // 接收客户端的文件
            int len;
            byte[] bytes = new byte[1024 * 1024];
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
            // 关闭输出流,确保文件完整保存 (BufferedOutputStream不归属socket管理,需要手动关闭
            bos.close();
            // 向客户端发送 “传输完毕” 的提示
            OutputStream os = socket.getOutputStream();
            os.write("传输完毕！".getBytes());
            // 标记传输结束
            socket.shutdownOutput();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 关闭资源
            if (socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
