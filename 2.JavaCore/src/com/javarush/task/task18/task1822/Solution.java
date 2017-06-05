package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        String fileName = null;
        String id = args[0];

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));){
        fileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String line = null;
        String[] array = new String[4];
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))){
            while ((line = fileReader.readLine()) != null){
                array = line.split(" ");
                if (id.equals(array[0])){
                    System.out.println(line);
                }
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }


    }
}
