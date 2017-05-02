package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            list.add(i, scanner.nextLine());
        }

        for (int i = 0; i < 13; i++) {
            String last = list.get(list.size()-1); //last string in list
            list.remove((list.size()-1)); //remove last string
            list.add(0, last);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}
