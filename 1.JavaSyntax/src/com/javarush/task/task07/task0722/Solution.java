package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        while (true){
            String tmp = scanner.nextLine();
            if (tmp.equals("end")){
                break;
            }
            else {
                list.add(tmp);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}