package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 5; i++) {
            sb.append(s);
        }
        result = sb.toString();
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < count; i++) {
            sb.append(s);
        }
        result = sb.toString();
        return result;
    }

    public static void main(String[] args) {

    }
}
