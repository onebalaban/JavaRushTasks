package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {

    String s;
    int i;
    double d;

    private Solution(){
    }

    Solution(String s){
        this.s = s;
    }

    protected Solution(int i){
        this.i = i;
    }

    public Solution(double d){
        this.d = d;
    }

    public static void main(String[] args) {

    }
}

