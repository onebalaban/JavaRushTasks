package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int [] x = new int[3];
        x[0] = scanner.nextInt();
        x[1] = scanner.nextInt();
        x[2] = scanner.nextInt();

        Arrays.sort(x);
        System.out.println(x[1]);

    }
}
