package com.javarush.task.task14.task1417;

/**
 * Created by Roman on 27.04.2017.
 */
public class Ruble extends Money{
    public Ruble(double a){
        super(a);
    }
    public String getCurrencyName(){
        return "RUB";
    }
}
