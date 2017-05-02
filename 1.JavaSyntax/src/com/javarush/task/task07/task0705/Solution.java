package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = new int[20];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            array[i] = scanner.nextInt();
        }

        int[] arraySmall1 = new int[10];
        int[] arraySmall2 = new int[10];

        for (int i = 0; i < 20; i++) {
            if(i < 10){
                arraySmall1[i] = array[i];
            }
            else{
                arraySmall2[i-10] = array[i];
                System.out.println(arraySmall2[i-10]);
            }
        }
    }
}
