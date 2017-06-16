package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        String fileName1 = null;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            fileName1 = reader.readLine();
        } catch (Exception e){
            e.printStackTrace();
        }

        //запоминаем настоящий PrintStream в специальную переменную
        PrintStream consoleStream = System.out;

        //Создаем динамический массив
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        //создаем адаптер к классу PrintStream
        PrintStream stream = new PrintStream(outputStream);
        //Устанавливаем его как текущий System.out
        System.setOut(stream);

        testString.printSomething();

        //Возвращаем все как было
        System.setOut(consoleStream);

        //Преобразовываем записанные в наш ByteArray данные в строку
        String result = outputStream.toString();

        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName1)){
            fileOutputStream.write(result.getBytes());
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

