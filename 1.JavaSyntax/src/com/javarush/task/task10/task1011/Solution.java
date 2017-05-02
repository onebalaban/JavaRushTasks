package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        int counter = 40;
        while (counter > 0) {
            if (list.get(0).equals(' ')){
                for (int i = 1; i < list.size(); i++) {
                        System.out.print(list.get(i));
                }
            }
            else {
                for (int i = 0; i < list.size(); i++) {
                        System.out.print(list.get(i));
                    }
            }
            System.out.println("");
            list.remove(0);
            counter--;
        }
    }

}

