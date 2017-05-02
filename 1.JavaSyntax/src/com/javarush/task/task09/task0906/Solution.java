package com.javarush.task.task09.task0906;

/* 
Логирование стек трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String classLog = stackTraceElements[2].getClassName();
        String methodLog = stackTraceElements[2].getMethodName();
        System.out.println(classLog + ": " + methodLog + ": " + s);
    }
}
