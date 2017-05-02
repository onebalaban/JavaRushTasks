package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Schwarzenegger", new Date("JUNE 1 1980"));
        map.put("VanDamme", new Date("JUNE 1 1980"));
        map.put("Willis", new Date("JANUARY 1 1980"));
        map.put("DeVito", new Date("JANUARY 1 1980"));
        map.put("Pitt", new Date("JANUARY 1 1980"));
        map.put("Lundgren", new Date("JANUARY 1 1980"));
        map.put("Rock", new Date("JANUARY 1 1980"));
        map.put("Chan", new Date("JANUARY 1 1980"));
        map.put("Lee", new Date("JANUARY 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry pair = (Map.Entry)iterator.next();
            Date date = (Date) pair.getValue();
            String name = (String) pair.getKey();
            int month = date.getMonth();
            if (month > 4 && month < 8){
                iterator.remove(); // avoids a ConcurrentModificationException
            }
        }
    }

    public static void main(String[] args) {

    }
}
