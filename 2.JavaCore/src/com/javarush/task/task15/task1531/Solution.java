package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        if (n < 0){
            return String.valueOf(0);
        }

        else if (n == 0){
            return String.valueOf(1);
        }

        else {
            BigDecimal fac = BigDecimal.valueOf(1);
            for (; n > 1; n--) {
                fac = fac.multiply(BigDecimal.valueOf(n));
            }
            return fac.toString();
        }
    }
}
