package com.axing.practice10FightGameForWord;

import java.util.Random;

/**
 * @projectName: test1
 * @package: com.axing.practice10FightGameForWord
 * @className: Role
 * @author: Axing
 * @description: 角色类
 * @date: 2024/3/27 19:11
 * @version: 1.0
 */
public class Role {
    //    容颜：
    private String[] boyfaces = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    private String[] girlfaces = {"美奂绝伦", "沉鱼落雁", "婷婷玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};
    //    attack 攻击描述：
    private String[] attacks_desc = {
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };
    //    injured 受伤描述：
    private String[] injureds_desc = {
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };

    // 角色名称
    private String name;
    // 角色生命值
    private int hp;
    private String gender;
    private String face;

    /**
     * @param role:
     * @return boolean
     * @author Axing
     * @description 攻击函数，调用者攻击参数角色，击败则返回true反之false
     * @date 2024/3/27 19:31
     */
    public boolean attack(Role role) {
        Random rand = new Random();
        // 随机造成1-20点伤害
        int hurt = rand.nextInt(20) + 1;
        // 随机攻击描述
        int index = rand.nextInt(attacks_desc.length);


        if (role.hp - hurt > 0) {
            // 输出随机攻击描述
            System.out.printf(attacks_desc[index], this.getName(), role.getName());
            System.out.println();
            // 根据被攻击角色的血量，输出受伤描述
            if (role.getHp() > 90) {
                System.out.printf(injureds_desc[0], role.getName());
            } else if (role.getHp() > 80) {
                System.out.printf(injureds_desc[1], role.getName());
            } else if (role.getHp() > 70) {
                System.out.printf(injureds_desc[2], role.getName());
            } else if (role.getHp() > 60) {
                System.out.printf(injureds_desc[3], role.getName());
            } else if (role.getHp() > 50) {
                System.out.printf(injureds_desc[4], role.getName());
            } else if (role.getHp() > 40) {
                System.out.printf(injureds_desc[5], role.getName());
            } else if (role.getHp() > 10) {
                System.out.printf(injureds_desc[6], role.getName());
            } else {
                System.out.printf(injureds_desc[7], role.getName());
            }
            System.out.println("  " + role.getName() + "剩余生命值：" + (role.getHp() - hurt));
            role.setHp(role.getHp() - hurt);
            return false;
        } else {
            // 进入致命一击阶段
            System.out.println(this.getName() + "对" + role.getName() + "造成了致命伤害：" + hurt + "点！");
            System.out.println(this.getName() + "击败了" + role.getName());
            role.setHp(0);
            return true;
        }
    }


    public Role() {
    }

    public Role(String name, int hp, String gender) {
        this.name = name;
        this.hp = hp;
        this.gender = gender;
        // 随机生成容颜
        Random rand = new Random();
        int index1 = rand.nextInt(boyfaces.length);
        int index2 = rand.nextInt(girlfaces.length);
        // 根据性别赋予不同的容颜描述
        if (gender.equals("男")) {
            this.face = boyfaces[index1];
        } else {
            this.face = girlfaces[index2];
        }
    }

    public void showRole() {
        System.out.println("角色名称：" + this.getName());
        System.out.println("角色生命值：" + this.getHp());
        System.out.println("角色性别：" + this.getGender());
        System.out.println("角色容颜：" + this.getFace());
    }

    /**
     * 获取
     *
     * @return boyfaces
     */
    public String[] getBoyfaces() {
        return boyfaces;
    }

    /**
     * 设置
     *
     * @param boyfaces
     */
    public void setBoyfaces(String[] boyfaces) {
        this.boyfaces = boyfaces;
    }

    /**
     * 获取
     *
     * @return girlfaces
     */
    public String[] getGirlfaces() {
        return girlfaces;
    }

    /**
     * 设置
     *
     * @param girlfaces
     */
    public void setGirlfaces(String[] girlfaces) {
        this.girlfaces = girlfaces;
    }

    /**
     * 获取
     *
     * @return attacks_desc
     */
    public String[] getAttacks_desc() {
        return attacks_desc;
    }

    /**
     * 设置
     *
     * @param attacks_desc
     */
    public void setAttacks_desc(String[] attacks_desc) {
        this.attacks_desc = attacks_desc;
    }

    /**
     * 获取
     *
     * @return injureds_desc
     */
    public String[] getInjureds_desc() {
        return injureds_desc;
    }

    /**
     * 设置
     *
     * @param injureds_desc
     */
    public void setInjureds_desc(String[] injureds_desc) {
        this.injureds_desc = injureds_desc;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return hp
     */
    public int getHp() {
        return hp;
    }

    /**
     * 设置
     *
     * @param hp
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    public String toString() {
        return "Role{boyfaces = " + boyfaces + ", girlfaces = " + girlfaces + ", attacks_desc = " + attacks_desc + ", injureds_desc = " + injureds_desc + ", name = " + name + ", hp = " + hp + "}";
    }

    /**
     * 获取
     *
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     *
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取
     *
     * @return face
     */
    public String getFace() {
        return face;
    }

    /**
     * 设置
     *
     * @param face
     */
    public void setFace(String face) {
        this.face = face;
    }
}
