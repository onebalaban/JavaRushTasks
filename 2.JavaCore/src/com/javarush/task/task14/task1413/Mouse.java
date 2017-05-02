package com.javarush.task.task14.task1413;

/**
 * Created by Roman on 27.04.2017.
 */
public class Mouse implements CompItem{
    public String getName(){
        return this.getClass().getSimpleName();
    }
}
