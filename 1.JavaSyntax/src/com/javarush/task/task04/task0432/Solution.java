package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int n = scanner.nextInt();

        while (n>0){
            System.out.println(string);
            n--;
        }

    }
}
