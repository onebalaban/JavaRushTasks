package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //map of cities and surnames
        HashMap<String,String> addresses = new HashMap<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) break;
            String surname = reader.readLine();
            addresses.put(city,surname);
        }

        //read city
        String city = reader.readLine();
        String surname = addresses.get(city);
        System.out.println(surname);
    }
}
