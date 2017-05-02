package com.javarush.task.task08.task0827;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date currentDate = new Date(date);
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(currentDate);

        if (calendar.get(Calendar.DAY_OF_YEAR) % 2 != 0){
            return true;
        }
        else {
            return false;
        }

//        int month = currentDate.getMonth();
//        int monthDay= currentDate.getDate();
//        int totalDays = 0;
//
//        switch (month){
//            case 0:  totalDays = 0;
//                break;
//            case 1:  totalDays = 31;
//                break;
//            case 2:  totalDays = 59;
//                break;
//            case 3:  totalDays = 90;
//                break;
//            case 4:  totalDays = 120;
//                break;
//            case 5:  totalDays = 151;
//                break;
//            case 6:  totalDays = 181;
//                break;
//            case 7:  totalDays = 212;
//                break;
//            case 8:  totalDays = 243;
//                break;
//            case 9: totalDays = 273;
//                break;
//            case 10: totalDays = 304;
//                break;
//            case 11: totalDays = 334;
//                break;
//        }
//
//        totalDays += monthDay;
//
//        if (totalDays%2 != 0) {
//            return true;
//        }
//        else {
//            return false;
//        }
    }
}
