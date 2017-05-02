package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самая длинная строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            list.add(i, scanner.nextLine());
        }

        //calculate longest string
        int tmp = 0;
        for (String i : list
             ) {
            if (i.length() > tmp){
                tmp = i.length();
            }
        }

        for (String i : list
                ) {
            if (i.length() == tmp){
                System.out.println(i);
            }
        }
    }
}
