package com.javarush.task.task09.task0922;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;



/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        Date date = formatter.parse(input);

        SimpleDateFormat formatterOut = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        String dateOut = formatterOut.format(date);

        System.out.println(dateOut.toUpperCase());
    }
}
