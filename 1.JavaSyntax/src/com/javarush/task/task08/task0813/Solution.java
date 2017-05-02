package com.javarush.task.task08.task0813;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static HashSet<String> createSet() {
        HashSet<String > set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add("Лол"+i);
        }
        return set;
    }

    public static void main(String[] args) {

    }
}
