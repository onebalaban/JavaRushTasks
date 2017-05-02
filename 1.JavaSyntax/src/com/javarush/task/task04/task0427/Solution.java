package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String parity = null;
        int digits = (int)Math.log10(a)+1;
        String dig=null;

        if (a%2 == 0 && a!=0){
            parity = "четное";
        }
        else if (a%2 != 0 && a!=0){
            parity = "нечетное";
        }

        if (digits==1){
            dig = "однозначное";
        }
        if (digits==2){
            dig = "двузначное";
        }
        if (digits==3){
            dig = "трехзначное";
        }

        if (a>=1 && a<=999){
            System.out.println(parity + " " + dig + " число");
        }

    }
}
