package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики 1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(1.2,"a");
        labels.put(1.3,"b");
        labels.put(1.4,"c");
        labels.put(1.5,"d");
        labels.put(1.6,"e");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
