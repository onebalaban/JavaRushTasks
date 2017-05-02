package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(array[9-i]);
        }
    }
}

