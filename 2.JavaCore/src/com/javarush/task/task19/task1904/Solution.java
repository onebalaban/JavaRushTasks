package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private Scanner fileScanner;
        public PersonScannerAdapter(Scanner fileScanner){
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String line = fileScanner.nextLine();
            String [] array = new String[6];
            array = line.split(" ");
            String date = array[3]+array[4]+array[5];
            Date birthDate = null;
            try {
                birthDate = new SimpleDateFormat("ddMMyyyy").parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            Person person = new Person(array[1], array[2], array[0], birthDate);
            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
