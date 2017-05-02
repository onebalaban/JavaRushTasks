package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        ArrayList<Integer> list4 = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            int tmp = scanner.nextInt();
            list1.add(i, tmp);
            if (tmp % 3 == 0){
                list2.add(tmp);
            }
            if (tmp %2 == 0){
                list3.add(tmp);
            }
            if ((tmp % 2 != 0) && (tmp % 3 != 0)){
                list4.add(tmp);
            }

        }

        printList(list2);
        printList(list3);
        printList(list4);


    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
