package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static int intLength(int a){
        double x = Math.log10(a)+1;
        return (int)x;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int x = intLength(a);



        for (int i = 0; i < x; i++) {
            int z = a % 10;
            if (z % 2 == 0){
                even++;
                a = a / 10;
            }
            else {
                odd++;
                a = a/10;
            }
        }
        System.out.println("Even: " + even + " Odd: " + odd);


    }
}
