package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.math.BigDecimal;
//import java.math.RoundingMode;

public class Solution {
    public static void main(String[] args) throws IOException {

        int symbolsCount = 0;
        int spaceCount = 0;

        String fileName = args[0];

        FileInputStream fileInputStream = new FileInputStream(fileName);

        BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));

        while (reader.ready()) {
            int tmp = reader.read();
            symbolsCount++;
            if (tmp == (int)' ') {
                spaceCount++;
            }
        }

        fileInputStream.close();
        reader.close();

        double result = (double) spaceCount / symbolsCount * 100;

        //double roundedResult = new BigDecimal(result).setScale(2, RoundingMode.HALF_UP).doubleValue();

        //System.out.println(roundedResult);

        System.out.println(String.format("%.2f",result));

    }
}
