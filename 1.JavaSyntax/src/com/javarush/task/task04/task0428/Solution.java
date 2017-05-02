package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int x=0;
        if (a>0){
            x++;
        }
        if (b>0){
            x++;
        }
        if (c>0){
            x++;
        }

        System.out.println(x);

    }
}
