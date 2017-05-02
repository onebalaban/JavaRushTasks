package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = new int[15];

        Scanner scanner = new Scanner(System.in);

        int evenPeople = 0;
        int oddPeople = 0;

        for (int i = 0; i < 15; i++) {
            array[i] = scanner.nextInt();
            if(i == 0){
                evenPeople += array[i];
            }
            else if(i % 2 == 0){
                evenPeople += array[i];
            }
            else{
                oddPeople += array[i];
            }
        }
        if(oddPeople > evenPeople){
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
        else {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
    }
}
