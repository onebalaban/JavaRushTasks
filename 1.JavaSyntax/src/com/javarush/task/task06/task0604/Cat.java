package com.javarush.task.task06.task0604;

/* 
Ставим котов на счётчик
*/

public class Cat {
    public static int catCount = 0;

    public Cat() {
        Cat.catCount++;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        Cat.catCount--;
    }

    public static void main(String[] args) {

    }
}