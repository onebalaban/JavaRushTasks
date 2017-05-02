package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    public Cat(String name) {
        this.name = name;
        this.weight = 5;
        this.age = 1;
        this.color = "red";
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "red";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.weight = 3;
        this.age = age;
        this.color = "green";
    }



    public Cat(int weight, String color) {
        this.weight = weight;
        this.age = 5;
        this.color = color;
    }

    public Cat(int weight, String color, String address) {

        this.weight = weight;
        this.age = 3;
        this.color = color;
        this.address = address;
    }

    private String name;
    private int weight;
    private int age;
    private String color;
    private String address;


    public static void main(String[] args) {

    }
}
