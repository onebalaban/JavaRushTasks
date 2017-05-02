package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int i = (int)scanner.nextDouble();
        int x = i%5;
        if (x==0){
            System.out.println("зеленый");
        }
        else if (x>=1 && x<3){
            System.out.println("зелёный");
        }
        else if (x>=3 && x<4){
            System.out.println("желтый");
        }
        else if (x >=4 && x<5){
            System.out.println("красный");
        }

    }
}