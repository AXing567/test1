package com.axing.practice30Net.problem3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @projectName: test1
 * @package: com.axing.practice30Net.problem3
 * @className: Server
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/22 上午9:06
 * @version: 1.0
 */
public class Server {
    public static void main(String[] args) throws IOException {
        // 建立与客户端的链接
        ServerSocket ss = new ServerSocket(10086);
        // 自定义线程池
        ThreadPoolExecutor tpe = new ThreadPoolExecutor(
                3,
                10,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(2),
                new ThreadPoolExecutor.AbortPolicy()
        );

        // 利用线程池以多线程的方式执行客户端提交的任务
        while (true) {
            Socket socket = ss.accept();
            tpe.submit(new MyRunnable(socket));
        }


    }
}
