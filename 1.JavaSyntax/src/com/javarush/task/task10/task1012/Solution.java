package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        int count = 0;

        ArrayList<Character> newArr = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            char [] newChar = list.get(i).toCharArray();
            for (int j = 0; j < newChar.length; j++) {
                newArr.add(newChar[j]);
            }
        }
        for (int i = 0; i < alphabet.size(); i++, count=0) {
            for (int j = 0; j < newArr.size(); j++) {
                if (alphabet.get(i).equals(newArr.get(j))){
                    count ++;
                }
            }
            System.out.println(alphabet.get(i) + " " + count);
        }
    }

}
