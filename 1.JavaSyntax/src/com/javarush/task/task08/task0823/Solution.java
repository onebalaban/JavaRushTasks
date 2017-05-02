package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }

        for (int i = 0; i < list.size(); i++) {
            if (i==0){
                list.set(0, Character.toUpperCase(list.get(0)));
            }
            if (i > 0 && (list.get(i-1).toString().equals(" "))){
                list.set(i,Character.toUpperCase(list.get(i)));
            }
        }

        for (char c:list
             ) {
            System.out.print(c);
        }


    }
}
