package com.axing.project2Doudizhu2;

import java.util.*;

public class PokerGame {
    static HashMap<Integer, String> hm = new HashMap<>();
    static ArrayList<Integer> al = new ArrayList<>();

/*
    {1=♥3, 2=🔶3, 3=♣3, 4=♠3, 5=♥4, 6=🔶4, 7=♣4, 8=♠4, 9=♥5, 10=🔶5, 11=♣5, 12=♠5,
    13=♥6, 14=🔶6, 15=♣6, 16=♠6, 17=♥7, 18=🔶7, 19=♣7, 20=♠7, 21=♥8, 22=🔶8, 23=♣8, 24=♠8,
    25=♥9, 26=🔶9, 27=♣9, 28=♠9, 29=♥10, 30=🔶10, 31=♣10, 32=♠10, 33=♥J, 34=🔶J, 35=♣J, 36=♠J,
    37=♥Q, 38=🔶Q, 39=♣Q, 40=♠Q, 41=♥K, 42=🔶K, 43=♣K, 44=♠K, 45=♥A, 46=🔶A, 47=♣A, 48=♠A,
    49=♥2, 50=🔶2, 51=♣2, 52=♠2, 53=小王, 54=大王}

*/

    static {
        String[] colors = {"♥", "🔶", "♣", "♠"};
        String[] nums = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        int i = 1;
        for (String num : nums) {
            for (String color : colors) {
                al.add(i);
                hm.put(i++, color + num);
            }
        }
        al.add(i);
        hm.put(i++, "小王");
        al.add(i);
        hm.put(i, "大王");
//        System.out.println(hm);
//        System.out.println(al);

    }

    public PokerGame() {
        // 洗牌
        Collections.shuffle(al);
        System.out.println(al);
        // 发牌
        TreeMap<Integer, String> lord = new TreeMap<>();
        TreeMap<Integer, String> player1 = new TreeMap<>();
        TreeMap<Integer, String> player2 = new TreeMap<>();
        TreeMap<Integer, String> player3 = new TreeMap<>();
        for (int i = 0 ; i < al.size() ; i++) {
            if (i < 3) {
                lord.put(al.get(i), hm.get(al.get(i)));
                continue;
            }
            if (i % 3 == 0) {
                player1.put(al.get(i), hm.get(al.get(i)));
            } else if (i % 3 == 2) {
                player2.put(al.get(i), hm.get(al.get(i)));
            } else {
                player3.put(al.get(i), hm.get(al.get(i)));
            }
        }

        // 看牌
        lookPoker("player1",player1);
        lookPoker("player2",player2);
        lookPoker("player3",player3);
        lookPoker("lord",lord);
    }

    public void lookPoker(String name, TreeMap<Integer, String> tm) {
        System.out.print(name + " = ");
        for (Map.Entry<Integer, String> entry : tm.entrySet()) {
            System.out.print(entry.getValue());
        }
        System.out.println();
    }
}
