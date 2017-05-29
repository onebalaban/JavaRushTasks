package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String filename1 = reader.readLine();
        String filename2 = reader.readLine();
        String filename3 = reader.readLine();
        reader.close();

        FileInputStream inputStream2 = new FileInputStream(filename2);
        FileInputStream inputStream3 = new FileInputStream(filename3);
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(inputStream2));
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(inputStream3));

        FileOutputStream outputStream1 = new FileOutputStream(filename1);

        while (reader2.ready()){
            outputStream1.write(reader2.read());
        }

        while (reader3.ready()){
            outputStream1.write(reader3.read());
        }

        inputStream2.close();
        inputStream3.close();
        outputStream1.close();

    }
}
