package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])))) {
            while (true){
                int i = reader.read();
                if (i == -1){
                    break;
                }
                else {
                    if (!map.containsKey(i)){
                        map.put(i,1);
                    }
                    else {
                        int count = map.get(i);
                        count++;
                        map.put(i,count);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Map<Integer, Integer> treeMap = new TreeMap<>(map);
        for (Map.Entry<Integer, Integer> pair : treeMap.entrySet()
             ) {
            System.out.println((char)(int)pair.getKey() + " " + pair.getValue());
        }
    }
}
