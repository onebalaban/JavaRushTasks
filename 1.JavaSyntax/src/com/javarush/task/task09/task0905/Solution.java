package com.javarush.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDeep();
    }

    public static int getStackTraceDeep() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int deep = 0;
        for (StackTraceElement element : stackTraceElements
             ) {
            deep++;
        }
        System.out.println(deep);
        return deep;
    }
}

