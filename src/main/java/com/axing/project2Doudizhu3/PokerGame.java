package com.axing.project2Doudizhu3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringJoiner;

public class PokerGame {
    static ArrayList<String> pokerList = new ArrayList<>();
    static HashMap<String,Integer> valCompHM = new HashMap<>();
    static HashMap<String,Integer> colorCompHM = new HashMap<>();
    //花色大小顺序为：黑桃>红心>方块>梅花

    // 准备牌
    static {
        String[] colors = {"♥", "♦", "♣", "♠"};
        String[] nums = {"3", "4", "5", "6", "7", "8", "9", "10","J", "Q", "K", "A", "2"};

        //创建牌堆，每张牌显示例如：♥3
        for (String s : colors) {
            for (String num : nums) {
                pokerList.add(s + num);
            }
        }
        pokerList.add(" 大王");
        pokerList.add(" 小王");

        valCompHM.put("J",11);
        valCompHM.put("Q",12);
        valCompHM.put("K",13);
        valCompHM.put("A",14);
        valCompHM.put("2",15);
        valCompHM.put("小王",50);
        valCompHM.put("大王",100);
//        花色大小顺序为：黑桃>红心>方块>梅花
        colorCompHM.put("♠",4);
        colorCompHM.put("♥",3);
        colorCompHM.put("♦",2);
        colorCompHM.put("♣",1);
        colorCompHM.put(" ",50);



    }
    public PokerGame(){
        sortPoker(pokerList);
        loopPoker("test",pokerList);
        // 洗牌
        Collections.shuffle(pokerList);

        // 发牌
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        for (int i = 0; i < pokerList.size(); i++) {
            if (i < 3) {
                lord.add(pokerList.get(i));
                continue;
            }
            switch (i % 3) {
                case 0: {
                    player1.add(pokerList.get(i));
                    break;
                }
                case 1: {
                    player2.add(pokerList.get(i));
                    break;
                }
                case 2: {
                    player3.add(pokerList.get(i));
                    break;
                }
            }
        }

        // 排序
        sortPoker(lord);
        sortPoker(player1);
        sortPoker(player2);
        sortPoker(player3);
        // 看牌
        loopPoker("lord",lord);
        loopPoker("player1",player1);
        loopPoker("player2",player2);
        loopPoker("player3",player3);
    }

    private int getVal(String num) {
        if(valCompHM.containsKey(num)){
            return valCompHM.get(num);
        }else {
            return Integer.parseInt(num);
        }
    }

    public void sortPoker(ArrayList<String> cards){
        Collections.sort(cards,(o1,o2)->{

            String color1 = o1.substring(0,1);
            int num1 = getVal(o1.substring(1));
            int colorNum1 = colorCompHM.get(o1.substring(0,1));
            int num2 = getVal(o2.substring(1));
            int colorNum2 = colorCompHM.get(o2.substring(0,1));
            String color2 = o2.substring(0,1);
            int i = num1 - num2;

            return i == 0 ? colorNum1 - colorNum2 : i;
        });
    }
    private void loopPoker(String name, ArrayList<String> cards) {
        System.out.print(name + " : ");
        StringJoiner sj = new StringJoiner(", ");
        for (String card : cards) {
            sj.add(card);
        }
        System.out.println(sj);

    }
}
