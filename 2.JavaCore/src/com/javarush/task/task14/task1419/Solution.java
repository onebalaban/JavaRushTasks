package com.javarush.task.task14.task1419;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] array = new int[1];
            array[2] = 5;
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String s = "abc";
            int i = Integer.parseInt(s);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            ArrayList list = new ArrayList();
            list.get(15);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int i = -10;
            int[] array = new int[i];
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String s = null;
            if (s.equals("aaa")){
                return;
            }
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new Exception();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String url = "jdbc:msql://200.210.220.1:1114/Demo";
            Connection conn = DriverManager.getConnection(url,"","");
            Statement stmt = conn.createStatement();
            ResultSet rs;
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new IOException();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new FileNotFoundException();
        } catch (Exception e) {
            exceptions.add(e);
        }

    }
}
