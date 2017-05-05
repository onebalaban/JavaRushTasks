package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                String value = reader.readLine();

                if (value.equals("exit")) break;

                try {
                    if (Integer.parseInt(value) > 127 || Integer.parseInt(value) < 1) {
                        print(Integer.parseInt(value));
                    } else {
                        print(Short.parseShort(value));
                    }
                } catch (Exception e1) {
                    try {
                        print(Double.parseDouble(value));
                    } catch (Exception e2) {
                        print(value);
                    }
                }

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
