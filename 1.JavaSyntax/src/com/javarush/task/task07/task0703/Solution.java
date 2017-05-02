package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] intArray = new int[10];
        String[] stringArray = new String[10];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            stringArray[i] = scanner.nextLine();
        }

        for (int i = 0; i < 10; i++) {
            intArray[i] = stringArray[i].length();
            System.out.println(intArray[i]);
        }
    }
}
