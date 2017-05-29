package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {

        int counter = 0;

        try (FileInputStream inputStream = new FileInputStream(args[0])) {
            while (inputStream.available() > 0){
                int sign = inputStream.read();
                String s = String.valueOf((char)sign);
                Boolean b = Pattern.matches("[a-zA-Z]", s);
                if (b) counter++;
            }
        }
        System.out.println(counter);
    }
}
