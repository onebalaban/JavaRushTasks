package com.javarush.task.task14.task1408;

/**
 * Created by Roman on 27.04.2017.
 */
public class UkrainianHen extends Hen {
    public int getCountOfEggsPerMonth() {
        return 10;
    }

    String getDescription() {
        return super.getDescription()+ " Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
