package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {

        String fileName1 = null;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            fileName1 = reader.readLine();
        } catch (Exception e){
            e.printStackTrace();
        }

        try (FileReader fileReader = new FileReader(fileName1)) {

            int count = 0;
            StringBuilder sb = new StringBuilder();

            while (fileReader.ready()){
                sb.append(String.valueOf((char)fileReader.read()));
            }

            String[] s = sb.toString().replaceAll("[^A-Za-z]", ",").split(",");


            for (int i = 0; i < s.length; i++) {
                if (s[i].toLowerCase().equals("world")){
                    count++;
                }
            }

            System.out.println(count);

           /* StringBuilder sb = new StringBuilder();

            while (fileReader.ready()){
                sb.append(String.valueOf((char)fileReader.read()));
            }

            String[] s = sb.toString().split(",");

            int count = 0;

            for (int i = 0; i < s.length; i++) {
                if (s[i].toLowerCase().equals("world")){
                    count++;
                }
            }

            System.out.println(count);*/


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
