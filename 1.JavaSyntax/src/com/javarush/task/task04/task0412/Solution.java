package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       int i = scanner.nextInt();
       if (i>0){
           i *= 2;
       }
       else if (i<0){
           i += 1;
       }
        System.out.println(i);

    }

}