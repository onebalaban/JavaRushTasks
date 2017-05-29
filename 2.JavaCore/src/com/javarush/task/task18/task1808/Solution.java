package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();
        reader.close();

        FileInputStream inputStream = new FileInputStream(fileName1);
        FileOutputStream outputStream2 = new FileOutputStream(fileName2);
        FileOutputStream outputStream3 = new FileOutputStream(fileName3);

        int totalBytesCount = inputStream.available();
        byte[] buffer = new byte[inputStream.available()];

        while (inputStream.available() > 0) {
            inputStream.read(buffer);
        }


        outputStream3.write(buffer, totalBytesCount/2 + totalBytesCount%2, totalBytesCount/2);
        outputStream2.write(buffer,0,totalBytesCount/2 + totalBytesCount%2);

        inputStream.close();
        outputStream2.close();
        outputStream3.close();

    }
}
