package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> filelist = new ArrayList();

        while (true){
            String filename = reader.readLine();
            if (filename.equals("end")){
                break;
            }
            else {
                filelist.add(filename);
            }
        }

        reader.close();

        Collections.sort(filelist);

        String tmp = filelist.get(0);
        String filenameOutput = tmp.substring(0, tmp.indexOf('.') + 4);

        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(filenameOutput, true));

        for (String s : filelist
             ) {
            try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(s))){
                while (inputStream.available() > 0){
                    outputStream.write(inputStream.read());
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }

        outputStream.close();

    }
}
