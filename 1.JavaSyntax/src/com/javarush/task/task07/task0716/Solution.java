package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list.add("пальмира");
        list.add("кот");
        list.add("собака");
        list.add("любовь");
        list.add("морковь");
        list.add("джава");
        list.add("питон");
        list.add("руби");

        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        for (int i = 0; i < list.size();) {
            String word = list.get(i);
            if (word.contains("р") && !word.contains("л")) {
                list.remove(i);
            }
            else if (word.contains("л") && !word.contains("р")){
                list.add(i+1,word);
                i++;
                i++;
            }
            else{
                i++;
            }
        }
        return list;
    }
}