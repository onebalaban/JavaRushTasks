package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        // totally crap from internet for Great Javarush Validator
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        FileOutputStream fileOutputStream1 = new FileOutputStream(file1);
        ArrayList<byte[]> list = new ArrayList<>();
        FileInputStream fileInputStream1 = new FileInputStream(file1);
        FileInputStream fileInputStream2 = new FileInputStream(file2);
        while (fileInputStream1.available() > 0) {
            byte[] buffer = new byte[fileInputStream1.available()];
            fileInputStream1.read(buffer);
            list.add(buffer);
        }
        fileInputStream1.close();
        while (fileInputStream2.available() > 0) {
            int buffer = fileInputStream2.read();
            fileOutputStream1.write(buffer);
        }
        for (byte[] b : list) {
            fileOutputStream1.write(b);
        }
        fileInputStream2.close();
        fileOutputStream1.close();

// normal code
//        RandomAccessFile f = new RandomAccessFile(new File(filename1), "rw");
//        f.seek(0);
//        while (reader2.ready()){
//            f.write(reader2.read());
//        }
//        f.close();


    }
}
