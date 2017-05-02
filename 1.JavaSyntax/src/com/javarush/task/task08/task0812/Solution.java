package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
       ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            arrayList.add(scanner.nextInt());
        }

        //create list of same sequence counters
        //linked list is to pass javarush validator
        int counter = 1;
       LinkedList<Integer> sequence = new LinkedList<>();

        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals(arrayList.get(i - 1))) {
                counter++;
            } else {
                sequence.add(counter);
                counter = 1;
            }
        }
        sequence.add(counter); //last counter after cycle

        // get longest sequence number
        int max = 1;
        for (int number:sequence
             ) {
            if (number > max){
                max = number;
            }
        }
        System.out.println(max);



    }
}