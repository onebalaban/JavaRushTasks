package com.javarush.task.task19.task1906;

/* 
Четные байты
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


        try (FileWriter fileWriter = new FileWriter(fileName2); FileReader fileReader = new FileReader(fileName1)) {
            int index = 0;
            while (fileReader.ready()){
                int tmp = fileReader.read();
                index++;
                if (index  % 2 == 0 && index != 0 ){
                    fileWriter.write(tmp);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
