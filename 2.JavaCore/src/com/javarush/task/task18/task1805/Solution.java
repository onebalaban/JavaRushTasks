package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream (reader.readLine());

        TreeSet<Integer> set = new TreeSet<>();

        while (inputStream.available() > 0) {
            int tmp = inputStream.read();
            set.add(tmp);
        }

        for (Integer x : set){
            System.out.print( x + " ");
        }

        reader.close();
        inputStream.close();

    }
}
