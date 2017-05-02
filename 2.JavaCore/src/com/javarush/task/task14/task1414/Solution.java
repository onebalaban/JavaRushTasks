package com.javarush.task.task14.task1414;

/* 
MovieFactory
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String s = scanner.nextLine().toLowerCase();

            Movie movie = null;
            try {
                movie = MovieFactory.getMovie(s);
            } catch (Exception e) {
                e.printStackTrace();
            }

            if (!(s.equals("soapopera")) && !(s.equals("cartoon")) && !(s.equals("thriller"))){
                break;
            }


            System.out.println(movie.getClass().getSimpleName());
        }

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapopera".equals(key)) {
                movie = new SoapOpera();
            }

            if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }

            if ("thriller".equals(key)) {
                movie = new Thriller();
            }

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie{

    }

    static class Thriller extends Movie{

    }
}
