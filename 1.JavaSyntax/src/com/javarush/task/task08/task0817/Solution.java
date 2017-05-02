package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String,String> map = new HashMap<>();
        map.put("Иванов","Коля");
        map.put("Петров","Сергей");
        map.put("Сидоров","Армэн");
        map.put("Попов","Вася");
        map.put("Андреев","Вася");
        map.put("Сергеев","Сергей");
        map.put("Михайлов","Рома");
        map.put("Васин","Армэн");
        map.put("Волкова","Наташа");
        map.put("Бубликова","Оля");
        return map;


    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> mapCopy = new HashMap<String, String> (map);
        for (Map.Entry<String, String> pair: map.entrySet()
             ) {
            String name = pair.getValue();
            int counter = 0;
            if (mapCopy.containsValue(name)){
                counter++;
            }
            if (counter > 1){
                removeItemFromMapByValue(mapCopy, name);
            }
        }
        map = mapCopy;

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
