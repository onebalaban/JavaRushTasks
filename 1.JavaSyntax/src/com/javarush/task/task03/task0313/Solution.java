package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/

public class Solution {
    public static void main(String[] args) {
        String[] s = {"Мама", "Мыла", "Раму"};
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (i != j) {
                    System.out.println(s[i] + s[j] + s[3 - i - j]);
                }
            }

        }
    }
}
