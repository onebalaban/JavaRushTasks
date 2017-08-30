package com.javarush.task.task20.task2003;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

/* 
Знакомство с properties
*
* рабочий вариант
*
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();


    public void fillInPropertiesMap() throws Exception {
        //implement this method - реализуйте этот метод
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        InputStream inputStream = new FileInputStream(fileName);
        load(inputStream);
        OutputStream outputStream = new FileOutputStream(fileName);
        save(outputStream);

    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties prop = new Properties();
        for (Map.Entry<String, String> pair: properties.entrySet()) {
            prop.setProperty(pair.getKey(), pair.getValue());
        }
        prop.store(outputStream, null);
        outputStream.close();
    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties prop = new Properties();
        prop.load(inputStream);
        properties.clear();
        Set<String> keys = prop.stringPropertyNames();
        for (String key:keys) {
            properties.put(key, prop.getProperty(key));
        }
        inputStream.close();
    }

    public static void main(String[] args) {

    }
}
