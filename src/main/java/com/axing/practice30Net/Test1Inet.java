package com.axing.practice30Net;

import java.net.InetAddress;
import java.net.UnknownHostException;

import static java.net.InetAddress.getByName;

/**
 * @projectName: test1
 * @package: com.axing.practice30Net
 * @className: Test1Inet
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/21 上午11:49
 * @version: 1.0
 */
public class Test1Inet {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = getByName("192.168.115.45");
        System.out.println(address.getHostAddress());
        System.out.println(address.getHostName());
    }

}
