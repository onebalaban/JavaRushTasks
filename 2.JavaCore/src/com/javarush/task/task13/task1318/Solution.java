package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        InputStream inputStream = new FileInputStream(filename);

        while (inputStream.available()>0){
            System.out.print((char)inputStream.read());
        }

        inputStream.close();
        reader.close();

        System.out.println();
    }
}