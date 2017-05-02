package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> map = new HashMap<>();
        int id = 0;
        String name = null;

        while (true) {
            try {
                id = Integer.parseInt(reader.readLine());
            } catch (Exception e) {
                break;
            }
            name = reader.readLine();
            map.put(name,id);
        }

        for (Map.Entry<String, Integer> pair : map.entrySet()
             ) {
                String key = pair.getKey();
                int value = pair.getValue();
            System.out.println(value + " " + key);
        }
    }
}
