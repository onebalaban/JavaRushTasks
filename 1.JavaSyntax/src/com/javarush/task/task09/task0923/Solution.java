package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayList<Character> glasn = new ArrayList<>();
        ArrayList<Character> other = new ArrayList<>();

        // vowels to glasn list, others to other list, except spaces
        for (int i = 0; i < input.length(); i++) {
            if (isVowel(input.charAt(i))){
                glasn.add(input.charAt(i));
            }
            else{
                if (input.charAt(i) != ' ') {
                    other.add(input.charAt(i));
                }
            }
        }

        for (char c : glasn
             ) {
            System.out.print(c + " ");
        }

        System.out.println();

        for (char c : other
                ) {
            System.out.print(c + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}