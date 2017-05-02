package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        InputStream inputStream = new FileInputStream(scanner.nextLine());
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

        ArrayList<Integer> list = new ArrayList<>();

        while (reader.ready()){
            list.add(Integer.parseInt(reader.readLine()));
        }


        Collections.sort(list);

        for (Integer i : list
             ) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
        inputStream.close();
        reader.close();
    }
}
