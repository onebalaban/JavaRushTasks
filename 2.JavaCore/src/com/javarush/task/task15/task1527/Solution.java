package com.javarush.task.task15.task1527;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.*;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws MalformedURLException, UnsupportedEncodingException {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        URL url = new URL(s);

        ArrayList<String> valuesList = splitQuery(url);

        for (int i = 0; i < valuesList.size() - 1; i++) {
            System.out.print(valuesList.get(i) + " ");
        }
        String lastItem = valuesList.get(valuesList.size() - 1);
        System.out.print(lastItem);
        System.out.println("");

        objQuery(url);

//        Object obj = objQuery(url);
//        try {
//            double d = Double.parseDouble((String) obj);
//            alert(d);
//        } catch (Exception e) {
//            alert((String) obj);
//        }
    }


//        Map query_pairs = splitQuery(url);
//
//        Iterator iterator = query_pairs.entrySet().iterator();
//
//        while (iterator.hasNext()){
//            Map.Entry pair = (Map.Entry)iterator.next();
//            String key = (String)pair.getKey();
//            System.out.print(key + " ");
//
//        }
//        System.out.println("");
//
//        Iterator iterator2 = query_pairs.entrySet().iterator();
//
//        while (iterator2.hasNext()){
//            Map.Entry pair = (Map.Entry)iterator2.next();
//            String key = (String)pair.getKey();
//            String  value = (String) pair.getValue();
//
//            if (key.equals("obj")){
//                try {
//                    double d = Double.parseDouble(value);
//                    alert(d);
//                } catch (Exception e){
//                    alert((String)value);
//                }
//            }
//        }


//    public static Map<String, String> splitQuery(URL url) throws UnsupportedEncodingException {
//        Map<String, String> query_pairs = new HashMap<>();
//        String query = url.getQuery();
//        String[] pairs = query.split("&");
//        for (String pair : pairs) {
//            int equalsSign = pair.indexOf("=");
//            if (equalsSign == -1){
//                query_pairs.put(pair, null);
//
//            }
//            else {
//                query_pairs.put(URLDecoder.decode(pair.substring(0, equalsSign), "UTF-8"), URLDecoder.decode(pair.substring(equalsSign + 1), "UTF-8"));
//            }
//        }
//        return query_pairs;
//    }


    public static ArrayList<String> splitQuery(URL url) throws UnsupportedEncodingException {
        ArrayList<String> splitQuery = new ArrayList<>();
        String query = url.getQuery();
        String[] pairs = query.split("&");
        for (String pair : pairs) {
            int equalsSign = pair.indexOf("=");
            if (equalsSign == -1){
                splitQuery.add(pair);

            }
            else {
                String tmp = URLDecoder.decode(pair.substring(0, equalsSign), "UTF-8");
                splitQuery.add(tmp);
                if (tmp.equals("obj")){
                    String tmp2 = URLDecoder.decode(pair.substring(equalsSign + 1), "UTF-8");

                }
            }
        }
        return splitQuery;
    }

    public static void objQuery(URL url) throws UnsupportedEncodingException {
        ArrayList<String> splitQuery = new ArrayList<>();
        String query = url.getQuery();
        String[] pairs = query.split("&");

        for (String pair : pairs) {
            int equalsSign = pair.indexOf("=");

            if (equalsSign == -1) {
                if (pair.equals("obj")) {
                    try {
                        double d = Double.parseDouble(pair);
                        alert(d);
                    } catch (Exception e) {
                        alert(pair);
                    }
                }
            } else {
                String tmp = URLDecoder.decode(pair.substring(0, equalsSign), "UTF-8");
                if (tmp.equals("obj")) {
                    String s = (String) URLDecoder.decode(pair.substring(equalsSign + 1), "UTF-8");
                    try {
                        double d = Double.parseDouble(s);
                        alert(d);
                    } catch (Exception e) {
                        alert(s);
                    }
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
