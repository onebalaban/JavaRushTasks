package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int minimum = array.get(0);
        for (int x:array
             ) {
            if(x<minimum){
                minimum = x;
            }
        }
        return minimum;
    }

    public static List<Integer> getIntegerList() throws IOException {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            integerList.add(scanner.nextInt());
        }
        return integerList;
    }
}
