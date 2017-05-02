package com.javarush.task.task14.task1418;

import java.util.LinkedList;
import java.util.List;

/* 
Исправь 4 ошибки
*/

public class Solution {
    public static void main(String[] args) {
        List<Number> list = new LinkedList<Number>();
    }


    public static void initList(List list) {

        list.add(new Double(1000f));
        list.add(new Double("123e-445632"));
        list.add(new Float(-90 / -3));
        list.remove(new Double("123e-445632"));

    }

    public static void printListValues(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

    public static void processCastedObjects(List list) {
        for (Object object : list) {
            if (object instanceof Float) {
                Float a = (float) object;
                System.out.println("Is float value defined? " + !(a.isNaN()));
            } else if (object instanceof Double) {
                Double a = (double) object;
                System.out.println("Is double value infinite? " + a.isInfinite());
            }
        }
    }
}

