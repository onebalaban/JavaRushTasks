package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        boolean check = false;
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (!check){
            int x = scanner.nextInt();
            sum += x;
            if (x == -1){
                check = true;
                System.out.println(sum);
            }
        }
    }
}
