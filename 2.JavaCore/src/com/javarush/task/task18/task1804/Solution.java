package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        reader.close();

        FileInputStream fileInputStream = new FileInputStream(fileName);

        HashMap<Integer, Integer> map = new HashMap<>();

        while (fileInputStream.available() > 0) {
            int tmp = fileInputStream.read();
            if (!map.containsKey(tmp)) {
                map.put(tmp, 1);
            } else {
                int value = map.get(tmp);
                value++;
                map.put(tmp, value);
            }
        }

        fileInputStream.close();


        int min = 0;
        for(Map.Entry pair: map.entrySet()) {
            if (min == 0){
                min = (int) pair.getValue();
            }
            else if ((int)pair.getValue() < min){
                min = (int) pair.getValue();
            }
        }

        for (Map.Entry pair: map.entrySet()) {
            if(pair.getValue().equals(min)) System.out.print(pair.getKey() + " ");
        }


    }
}
