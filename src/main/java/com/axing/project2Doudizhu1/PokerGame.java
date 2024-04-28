package com.axing.project2Doudizhu1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.StringJoiner;

public class PokerGame {
    static ArrayList<String> poker = new ArrayList<>();

    // 准备牌
    static {
        String[] colors = {"♥", "🔶", "♣", "♠"};
        String[] nums = {"3", "4", "5", "6", "7", "8", "9", "10","J", "Q", "K", "A", "2"};

        //创建牌堆，每张牌显示例如：♥3
        for (String s : colors) {
            for (String num : nums) {
                poker.add(s + num);
            }
        }

    }

    public PokerGame() {
        // 准备牌

        // 洗牌
        Collections.shuffle(poker);

        // 发牌
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        for (int i = 0; i < poker.size(); i++) {
            if (i < 3) {
                lord.add(poker.get(i));
                continue;
            }
            switch (i % 3) {
                case 0: {
                    player1.add(poker.get(i));
                    break;
                }
                case 1: {
                    player2.add(poker.get(i));
                    break;
                }
                case 2: {
                    player3.add(poker.get(i));
                    break;
                }
            }
        }

        // 看牌
//        look(lord,player1,player2,player3);
        loopPoker("lord",lord);
        loopPoker("player1",player1);
        loopPoker("player2",player2);
        loopPoker("player3",player3);

    }

    private void loopPoker(String name, ArrayList<String> cards) {
        System.out.print(name + " : ");
        StringJoiner sj = new StringJoiner(", ");
        for (String card : cards) {
            sj.add(card);
        }
        System.out.println(sj);

    }

    private void look(ArrayList<String>...cards) {
        for (ArrayList<String> card : cards) {
            StringJoiner sj = new StringJoiner(",");
            for (String s : card) {
                sj.add(s);
            }
            System.out.println(sj);
        }
    }


    public String toString() {
        return "PokerGame{}";
    }
}
