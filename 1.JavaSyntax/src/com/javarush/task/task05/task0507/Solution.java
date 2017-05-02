package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;
        boolean b = false;

        while (!b){
            int x = scanner.nextInt();
            if (x != -1) {
                counter++;
                sum += x;
            }
            else b = true;
        }
        System.out.println((double)sum/(double)counter);
    }
}

