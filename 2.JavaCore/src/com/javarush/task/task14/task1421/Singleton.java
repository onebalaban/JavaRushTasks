package com.javarush.task.task14.task1421;

/**
 * Created by Roman on 28.04.2017.
 */
public class Singleton {

    private Singleton() {
    }

    private static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }
}
