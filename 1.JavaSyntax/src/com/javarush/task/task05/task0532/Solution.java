package com.javarush.task.task05.task0532;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        int maximum = 0; //define variable

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //enter positive number N
        if ( n <= 0 ) {
            throw new Exception("Positive number only");
        }

        ArrayList<Integer> list = new ArrayList<>();

        //create a list of size N, which we entered earlier
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        //assign first element of list
        maximum = list.get(0);

        //find maximum integer in a list and assign it to int maximum
        for (Integer aList : list) {
            if (aList > maximum) {
                maximum = aList;
            }
        }

        System.out.println(maximum);
    }
}
