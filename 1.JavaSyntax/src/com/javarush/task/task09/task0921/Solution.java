package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        ArrayList<Integer> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(System.in);

            while (true){
                list.add(scanner.nextInt());
            }
        } catch (Exception e) {
            for (int x : list
                 ) {
                System.out.println(x);
            }
        }
    }
}
