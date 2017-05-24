package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые частые байты
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


        int max = 0;
        for(Map.Entry pair: map.entrySet()) {
            if ((int)pair.getValue() > max){
                max = (int) pair.getValue();
            }
        }

        for (Map.Entry pair: map.entrySet()) {
            if(pair.getValue().equals(max)) System.out.print(pair.getKey() + " ");
        }


    }
}
