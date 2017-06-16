package com.javarush.task.task19.task1909;

/* 
Замена знаков
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
            while ((tmp = fileReader.readLine()) != null){
                fileWriter.write(tmp.replaceAll("\\.", "!"));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
