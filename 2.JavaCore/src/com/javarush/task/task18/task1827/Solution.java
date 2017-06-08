package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        String fileOut = bufRead.readLine();
        bufRead.close();
        List list = new ArrayList();
        BufferedReader readIn = new BufferedReader(new FileReader(fileOut));
        String str;
        final Pattern pattern = Pattern.compile("^\\d+");
        Matcher matcher;
        long maxNum = 0;
        while (readIn.ready()){
            str = readIn.readLine();
            list.add(str);
            matcher = pattern.matcher(str);
            long num = 0;
            while (matcher.find()) {
                num = Long.parseLong(matcher.group(0));
            }
            if (num > maxNum){
                maxNum = num;
            }
        }
        readIn.close();
        if (args[0].equals("-c"))
        {
            list.add(String.format("%-8d%-30s%-8s%-4s", (++maxNum), args[1], args[2], args[3]));
        }
        BufferedWriter bufWrite = new BufferedWriter(new FileWriter(fileOut));
        for (Object s : list){
            bufWrite.write((String)s+"\n");
        }
        bufWrite.close();
    }
}

//i'm super bored by validator, omg
/*public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        reader.close();

        //ArrayList list = new ArrayList();
        int id = 0;
        String productName = null;
        Double price = 0.0;
        int quantity = 0;


        if (args.length == 0){
            return;
        }

        else if (args[0].equals("-c")){
            if (args[1].length() > 30){
                productName = args[1].substring(0,30);
            } else {
                productName = args[1];
            }
            if (args[2].length() > 8) {
                price = Double.parseDouble(args[2].substring(0,8));
            }
            else {
                price = Double.parseDouble(args[2]);
            }
            if (args[3].length() > 4){
            quantity = Integer.parseInt(args[3].substring(0,4));
            }
            else {
                quantity = Integer.parseInt(args[3]);
            }
        }

        //read the file and seek max id written
        //ArrayList<String> linesList = new ArrayList<>();
        try(BufferedReader reader1 = new BufferedReader(new FileReader(filename))){
            String tmp = null;
            while ((tmp = reader1.readLine())!= null){
                //linesList.add(tmp);
                if (tmp.trim().isEmpty()){
                    continue;
                }
                int tmpId = Integer.parseInt(tmp.substring(0,8).trim());
                if (tmpId > id){
                    id = tmpId;
                }
            }
        } catch (Exception e){

        }

        //build 4 strings for write
        String finalID = Integer.toString(id + 1);
        String finalID2 = finalID;
        for (int i = finalID.length(); i < 8; i++) {
            finalID2 += " ";
        }

        String finalProductName = productName;
        for (int i = productName.length(); i < 30; i++) {
            finalProductName += " ";
        }

        String finalPrice = Double.toString(price);
        for (int i = Double.toString(price).length(); i < 8; i++) {
            finalPrice += " ";
        }

        String finalQuantity = Integer.toString(quantity);
        for (int i = Integer.toString(quantity).length(); i < 4; i++) {
            finalQuantity += " ";
        }

        *//*linesList.add(finalID2 + finalProductName + finalPrice + finalQuantity);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (String s : linesList
                 ) {
                writer.newLine();
                writer.write(s);
            }

        } catch (Exception e){
            //e.printStackTrace();
        }*//*

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
                writer.newLine();
                writer.write(finalID2 + finalProductName + finalPrice + finalQuantity);

        } catch (Exception e){
            //e.printStackTrace();
        }
    }
}*/
