package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        //String fileName1 = "C://Temp//in.txt";
        //String fileName2 = "C://Temp//out.txt";
        reader.close();

        FileInputStream fileInputStream1 = new FileInputStream(fileName1);
        FileOutputStream fileOutputStream2 = new FileOutputStream(fileName2);

        byte[] buffer = new byte[fileInputStream1.available()];

        while (fileInputStream1.available() > 0) {
            fileInputStream1.read(buffer);
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (byte b : buffer
                ) {
            stringBuilder.append((char) b);
        }

        String s = stringBuilder.toString();

        String[] array = s.split(" ");

        for (int i = 0; i < array.length - 1; i++) {
            Double d = Double.parseDouble(array[i]);
            int result = (int) Math.round(d);
            fileOutputStream2.write(String.valueOf(result).getBytes());
            fileOutputStream2.write((byte) ' ');
        }

        //this block is for avoiding trailing ' ' at the previous cycle - task condition
        Double d = Double.parseDouble(array[array.length - 1]);
        int result = (int) Math.round(d);
        fileOutputStream2.write(String.valueOf(result).getBytes());

        fileInputStream1.close();
        fileOutputStream2.close();

    }
}
