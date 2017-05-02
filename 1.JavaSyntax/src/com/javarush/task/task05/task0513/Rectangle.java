package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    private int top;
    private int left;
    private int width;
    private int height;

    public void initialize(int top){
        this.top = top;
        this.left = 5;
        this.width = 5;
        this.height = 5;
    }

    public void initialize(int top, int left){
        this.top = top;
        this.left = left;
        this.width = 5;
        this.height = 5;
    }

    public void initialize(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = 5;
    }

    public void initialize(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {

    }
}
