package com.axing.practice10FightGameForWord;

/**
 * @projectName: test1
 * @package: com.axing.practice10FightGameForWord
 * @className: Test
 * @author: Axing
 * @description: TODO
 * @date: 2024/3/27 19:10
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Role r1 = new Role("张三", 100, "男");
        Role r2 = new Role("李四", 100, "女");
        // 两个角色互相攻击
        while (true) {
            // 如果击败则返回true
            if (r1.attack(r2)) {
                break;
            }
            if (r2.attack(r1)) {
                break;
            }
            System.out.println();
        }
        System.out.println();

        // 显示角色信息
        r1.showRole();
        System.out.println();
        r2.showRole();
        System.out.println();


    }
}
