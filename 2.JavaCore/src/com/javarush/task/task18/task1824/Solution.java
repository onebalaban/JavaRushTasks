package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {

        String fileName = null;



        while (true){
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));){
                fileName = reader.readLine();
            } catch (IOException e){
            }


            try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(fileName))) {


            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                return;


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
