package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    private String name = null;
    private int weight;
    private int age;
    private String address = null;
    private String color;

    public void initialize(String name){
        this.name = name;
        this.weight = 5;
        this.age = 3;
        this.color = "red";
    }

    public void initialize(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "red";
    }

    public void initialize(String name,int age){
        this.name = name;
        this.weight = 5;
        this.age = age;
        this.color = "red";
    }

    public void initialize(int weight,String color){
        this.weight = weight;
        this.age = 5;
        this.color = color;
    }

    public void initialize(int weight,String color, String address){
        this.weight = weight;
        this.age = 5;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
