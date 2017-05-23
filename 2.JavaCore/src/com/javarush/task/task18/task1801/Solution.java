package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        reader.close();

        FileInputStream fileInputStream = new FileInputStream(fileName);

        int maxByte = fileInputStream.read();

        while (fileInputStream.available() > 0){
            int tmp = fileInputStream.read();
            if (tmp > maxByte){
                maxByte = tmp;
            }
        }

        fileInputStream.close();

        System.out.println(maxByte);
    }
}
