package com.axing.practice28Thread.Problem4;

/**
 * @projectName: test1
 * @package: com.axing.practice28Thread.RedEnvelope.RedEnvelope
 * @className: Server
 * @author: Axing
 * @description: TODO
 * @date: 2024/5/16 上午10:23
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        RedEnvelope redEnvelope = new RedEnvelope();
        Thread people1 = new Thread(redEnvelope);
        Thread people2 = new Thread(redEnvelope);
        Thread people3 = new Thread(redEnvelope);
        Thread people4 = new Thread(redEnvelope);
        Thread people5 = new Thread(redEnvelope);

        people1.setName("张三");
        people2.setName("李四");
        people3.setName("王五");
        people4.setName("赵六");
        people5.setName("康帅博");

        people1.start();
        people2.start();
        people3.start();
        people4.start();
        people5.start();

    }
}
