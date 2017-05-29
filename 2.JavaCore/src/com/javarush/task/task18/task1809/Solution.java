package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        FileInputStream inputStream1 = new FileInputStream(fileName1);
        FileOutputStream outputStream2 = new FileOutputStream(fileName2);

        byte[] buffer = new byte[inputStream1.available()];

        int byteCount = inputStream1.read(buffer);

        for (int i = byteCount-1; i >= 0; i--) {
            outputStream2.write(buffer[i]);
        }

        inputStream1.close();
        outputStream2.close();

    }
}
