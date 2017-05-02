package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
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
        int z=0;

        if (a>0){
            x++;
        }

        if (b>0){
            x++;
        }

        if (c>0){
            x++;
        }


        if (a<0){
            z++;
        }

        if (b<0){
            z++;
        }

        if (c<0){
            z++;
        }

        System.out.println("количество отрицательных чисел: "+z);
        System.out.println("количество положительных чисел: "+x);

    }
}
