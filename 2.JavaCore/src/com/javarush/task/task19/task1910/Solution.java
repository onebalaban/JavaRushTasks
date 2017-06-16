package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {

        String fileName1 = null;
        String fileName2 = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            fileName1 = reader.readLine();
            fileName2 = reader.readLine();
        } catch (Exception e){
            e.printStackTrace();
        }

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName1)); BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2))) {
            String tmp;
            StringBuilder sb = new StringBuilder();
            while ((tmp = fileReader.readLine()) != null){
                sb.append(tmp);
            }

            String s = sb.toString().replaceAll("[^a-zA-Z ]", "");

            fileWriter.write(s);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
