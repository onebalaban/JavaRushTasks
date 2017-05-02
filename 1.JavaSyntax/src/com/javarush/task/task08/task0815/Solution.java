package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
       HashMap<String, String> map = new HashMap<>();
       map.put("Иванов", "Иван");
       map.put("Петров", "Иван");
       map.put("Сидоров", "Иван");
       map.put("Печкин", "Вася");
       map.put("Лоханкин", "Петя");
       map.put("Трамп", "Дональд");
       map.put("Обама", "Барак");
       map.put("Путин", "Владимир");
       map.put("Моржов", "Хрюн");
       map.put("Капуста", "Степан");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int counter = 0;
        for (HashMap.Entry<String, String> pair:map.entrySet()
             ) {
            String value = pair.getValue();
            if (value.equals(name)){
                counter++;
            }
        }
        return counter;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int counter = 0;
        for (HashMap.Entry<String, String> pair:map.entrySet()
                ) {
            String key = pair.getKey();
            if (key.equals(lastName)){
                counter++;
            }
        }
        return counter;

    }

    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
    }
}
