package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("a", 1000);
        map.put("b", 1000);
        map.put("c", 1000);
        map.put("d", 1000);
        map.put("e", 1000);
        map.put("f", 100);
        map.put("g", 100);
        map.put("h", 100);
        map.put("i", 100);
        map.put("j", 100);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry pair = (Map.Entry)iterator.next();
            int salary = (int) pair.getValue();
            if (salary < 500){
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}