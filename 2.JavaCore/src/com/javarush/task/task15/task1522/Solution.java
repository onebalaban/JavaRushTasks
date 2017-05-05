package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Закрепляем Singleton pattern
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    public static void readKeyFromConsoleAndInitPlanet(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        try {
            s = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }


        if (s.equals(Planet.SUN)){
            Solution.thePlanet = Sun.getInstance();
        }
        else if (s.equals(Planet.MOON)){
            Solution.thePlanet = Moon.getInstance();
        }
        else if (s.equals(Planet.EARTH)){
            Solution.thePlanet = Earth.getInstance();
        }
        else Solution.thePlanet = null;
    }

    static{
        readKeyFromConsoleAndInitPlanet();
    }
}
