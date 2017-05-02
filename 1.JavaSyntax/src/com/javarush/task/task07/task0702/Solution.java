package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] strings = new String[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            strings[i] = scanner.nextLine();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(strings[9-i]);
        }
    }
}