package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double x){
        this(x,5,5);
    }

    public Circle(double x, double y){
        this(x,y,5);
    }

    public Circle(){
        this(3,4,5);
    }

    public static void main(String[] args) {

    }
}