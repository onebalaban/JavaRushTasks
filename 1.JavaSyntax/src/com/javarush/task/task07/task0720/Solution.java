package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        //fill in list
        String tmp = scanner.nextLine(); //pass \n after previous scanner
        for (int i = 0; i < n; i++) {
            list.add(i,scanner.nextLine());
        }

        //move first m elements to the end of list
        for (int i = 0; i < m; i++) {
            list.add(list.get(0));
            list.remove(0);
            }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
