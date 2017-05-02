package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int a=0;
        int b=0;

        try {
            a = Integer.parseInt(scanner.nextLine());
         } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        try {
            b = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        if (a <= 0 || b <= 0){
            throw new Exception();
        }

        int gcd = 1;
        while (b !=0) {
                int tmp = a%b;
                a = b;
                b = tmp;
                gcd = a;
        }

        System.out.println(gcd);


    }
}
