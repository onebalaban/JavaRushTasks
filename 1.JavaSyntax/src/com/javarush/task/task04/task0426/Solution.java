package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String positivity = null;
        String parity = null;
        if (a<0){
            positivity = "отрицательное";
        }
        else if (a>0){
            positivity = "положительное";
        }

        if (a%2 == 0 && a!=0){
            parity = "четное";
        }
        else if (a%2 != 0 && a!=0){
            parity = "нечетное";
        }

        if (a==0){
            System.out.println("ноль");
        }

        else {
            System.out.println(positivity + " " + parity + " число");
        }
    }
}
