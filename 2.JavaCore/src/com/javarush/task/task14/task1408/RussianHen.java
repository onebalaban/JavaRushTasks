package com.javarush.task.task14.task1408;

/**
 * Created by Roman on 27.04.2017.
 */
public class RussianHen extends Hen {
    public int getCountOfEggsPerMonth(){
        return 1000;
    }

    String getDescription(){
        return super.getDescription()+ " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
