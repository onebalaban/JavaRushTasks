package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Pattern;

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


        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2)); BufferedReader fileReader = new BufferedReader(new FileReader(fileName1))) {
            StringBuilder sb = new StringBuilder();
            String tmp;
            while ((tmp = fileReader.readLine()) != null){
                sb.append(tmp);
            }
            String[] s = sb.toString().split(" ");
            ArrayList<String> list = new ArrayList<>();

            for (int i = 0; i < s.length; i++) {
                try {
                    Integer.parseInt(s[i]);
                    list.add(s[i]);
                } catch (NumberFormatException e){
                    continue;
                }
            }

            for (int i = 0; i < list.size()-1; i++) {
                fileWriter.write(list.get(i));
                fileWriter.write(" ");
            }
            fileWriter.write(list.get(list.size()-1));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
