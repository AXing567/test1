package com.axing.practice11;

import java.util.Scanner;

/**
 * @projectName: test1
 * @package: com.axing.practice11
 * @className: Test
 * @author: Axing
 * @description: TODO
 * @date: 2024/3/27 20:28
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < cars.length; i++) {
            System.out.println("请输入汽车的品牌、价格、颜色（每个值用回车键入）：");
            String brand = sc.next();
            Double price = sc.nextDouble();
            String color = sc.next();
            cars[i] = new Car(brand, price, color);
        }
        for (Car car : cars) {
            System.out.println(car.toString());
        }

    }
}
