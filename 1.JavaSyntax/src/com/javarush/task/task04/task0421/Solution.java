package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        if (name1.equals(name2)){
            System.out.println("Имена идентичны");
        }
        else{
            if (name1.length() == name2.length()){
                System.out.println("Длины имен равны");
            }
        }
    }
}
