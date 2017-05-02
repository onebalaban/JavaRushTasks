package com.javarush.task.task14.task1408;

/**
 * Created by Roman on 27.04.2017.
 */
public class BelarusianHen extends Hen {
    public int getCountOfEggsPerMonth() {
        return 100;
    }

    String getDescription() {
        return super.getDescription()+ " Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
