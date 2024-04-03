package com.axing.practice11;

/**
 * @projectName: test1
 * @package: com.axing.practice11
 * @className: Car
 * @author: Axing
 * @description: TODO
 * @date: 2024/3/27 20:28
 * @version: 1.0
 */
public class Car {
    // 品牌
    private String brand;
    // 价格
    private Double price;
    // 颜色
    private String color;

    public Car() {
    }

    public Car(String brand, Double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    /**
     * 获取
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 获取
     * @return price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 获取
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Car{brand = " + brand + ", price = " + price + ", color = " + color + "}";
    }
}
