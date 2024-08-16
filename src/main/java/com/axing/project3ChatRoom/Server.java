package com.axing.project3ChatRoom;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Properties;

/**
 * @projectName: test1
 * @package: com.axing.project3ChatRoom
 * @className: Server
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/25 上午8:51
 * @version: 1.0
 */
public class Server {
    static ArrayList<Socket> socketList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        // 加载本地数据
        Properties prop = new Properties();
        prop.load(new BufferedReader(new FileReader("E:\\IDEAProject\\test1\\src\\main\\java\\com\\axing\\project3ChatRoom\\userinfo.txt")));

        ServerSocket ss = new ServerSocket(10086);

        while (true) {
            Socket socket = ss.accept();
            socketList.add(socket);
            new Thread(new MyServerRunnable(socket, prop)).start();
        }
    }


}

class MyServerRunnable implements Runnable {
    Socket socket;
    Properties prop;

    public MyServerRunnable(Socket socket, Properties prop) {
        this.socket = socket;
        this.prop = prop;
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true) {
                // 第一次接收 识别用户选择
                String chose = br.readLine();
                switch (chose) {
                    case "login" -> login(br);
                    case "register" -> register(br);
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void login(BufferedReader br) throws IOException {
        String message = br.readLine();
        System.out.println(message);
        String usernameInput = message.split("&")[0].split("=")[1];
        String passwordInput = message.split("&")[1].split("=")[1];
        if (prop.containsKey(usernameInput)) {
            if (passwordInput.equals(prop.get(usernameInput))) {
                System.out.println("账号密码正确");
                // 向客户端回写状态码
                server2Client(socket, "1");
                while (true) {
                    message = br.readLine();
                    for (Socket s : Server.socketList) {
                        server2Client(s, usernameInput + "发来了一条消息：" + message);
                    }
                    System.out.println(usernameInput + "发来了一条消息：" + message);
                }
            } else {
                System.out.println("密码错误");
                server2Client(socket, "2");
            }
        } else {
            System.out.println("账号不存在");
            server2Client(socket, "3");
        }
    }

    private void register(BufferedReader br) throws IOException {
        System.out.println("用户选择注册");
        String message = br.readLine();
        String usernameInput = message.split("&")[0].split("=")[1];
        String passwordInput = message.split("&")[1].split("=")[1];

        if (prop.containsKey(usernameInput)) {
            System.out.println("账号存在");
            server2Client(socket, "2");
        } else {
            prop.setProperty(usernameInput,passwordInput);
            prop.store(new FileWriter("E:\\IDEAProject\\test1\\src\\main\\java\\com\\axing\\project3ChatRoom\\userinfo.txt"),"");
            System.out.println("注册成功！");
            server2Client(socket, "1");
        }
    }

    private void server2Client(Socket socket, String message) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write(message);
        bw.newLine();
        bw.flush();
    }
}
