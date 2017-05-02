package com.javarush.task.task13.task1319;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

/* 
Запись в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new FileWriter(input.readLine()));
        String s;
        while (!(s = input.readLine()).equals("exit")){
            output.append(s);
            output.newLine();
        }
        output.append("exit");
        output.close();
    }
}
