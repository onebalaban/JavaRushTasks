package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(args[1]));

        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(args[2]));

        if (args[0].equals("-e")){
            outputStream.write(42);
            while (inputStream.available() > 0){
                outputStream.write(inputStream.read());
            }
        }
        else if (args[0].equals("-d")){
            inputStream.read();
            while (inputStream.available() > 0){
                outputStream.write(inputStream.read());
            }
        }

        try {
            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
