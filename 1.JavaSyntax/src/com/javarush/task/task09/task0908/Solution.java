package com.javarush.task.task09.task0908;

/* 
Исключение при работе со строками
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String s = null;
        try {
            String m = s.toLowerCase();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
