package com.axing.project3ChatRoom;

import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @projectName: test1
 * @package: com.axing.project3ChatRoom
 * @className: Client
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/25 上午8:51
 * @version: 1.0
 */
public class Client {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10086);
        System.out.println("=========服务器链接成功=========");
        System.out.println("=========欢迎来到聊天室=========");

        while (true) {
            System.out.println("1 登录");
            System.out.println("2 注册");
            System.out.println("请输入您的选择：");
            String chose = scanner.nextLine();
            switch (chose) {
                case "1" -> login(socket);
                case "2" -> register(socket);
                default -> System.out.println("输入错误，请重新输入！");
            }
        }
    }

    private static void login(Socket socket) throws IOException {
        // 发送登录或注册
        client2Server(socket, "login");

        StringBuilder sb = inputUnameAndPassword();

        // 向服务器发送数据
        client2Server(socket, sb.toString());

        // 从服务器接收数据
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String state = br.readLine();
        switch (state) {
            case "1" -> chatWithAll(socket);
            case "2" -> System.out.println("账号密码错误");
            case "3" -> System.out.println("账号不存在");
            default -> System.out.println("奇怪的异常？？" + state);
        }

    }

    private static void register(Socket socket) {
        try {
            // 告诉服务器，要登录
            client2Server(socket, "register");
            // 接收账号密码
            StringBuilder sb = inputUnameAndPassword();
            // 将账号密码发送给服务器
            client2Server(socket, sb.toString());

            // 从服务器接收状态数据
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String state = br.readLine();
            switch (state) {
                case "1" -> System.out.println("注册成功");
                case "2" -> System.out.println("账号已经存在");
                default -> System.out.println("奇怪的异常？？" + state);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static @NotNull StringBuilder inputUnameAndPassword() {
        System.out.println("请输入账号：");
        String usernameInput = scanner.nextLine();
        System.out.println("请输入密码：");
        String passwordInput = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append("username=").append(usernameInput).append("&password=").append(passwordInput);
        return sb;
    }

    private static void chatWithAll(Socket socket) throws IOException {
        System.out.println("登录成功！");
        new Thread(new Receive(socket)).start();
        while (true) {
            System.out.println("请输入要发送的信息:");
            String message = scanner.nextLine();
            client2Server(socket, message);

        }
    }

    private static void client2Server(Socket socket, String message) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write(message);
        bw.newLine();
        bw.flush();
    }
}


class Receive implements Runnable {
    Socket socket;

    public Receive(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true) {
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
