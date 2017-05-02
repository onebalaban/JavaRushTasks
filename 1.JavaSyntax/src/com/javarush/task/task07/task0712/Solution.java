package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            list.add(i, scanner.nextLine());
        }

        //calculate shortest string and pos
        int tmpShort = (list.get(0).length());
        int tmpShortPosition = 0;
        for (String i : list
                ) {
            if (i.length() < tmpShort){
                tmpShort = i.length();
                tmpShortPosition = list.indexOf(i);
            }
        }

        //calculate longest string and pos
        int tmpLong = 0;
        int tmpLongPosition = 0;
        for (String i : list
                ) {
            if (i.length() > tmpLong){
                tmpLong = i.length();
                tmpLongPosition = list.indexOf(i);
            }
        }

        if (tmpShortPosition < tmpLongPosition){
            System.out.println(list.get(tmpShortPosition));
        }
        else if (tmpShortPosition > tmpLongPosition) {
            System.out.println(list.get(tmpLongPosition));
        }
    }
}
