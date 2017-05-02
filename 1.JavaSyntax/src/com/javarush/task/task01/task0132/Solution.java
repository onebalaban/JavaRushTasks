package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int sum = 0;
        int length = (int)(Math.log10(number)+1);
        for (int i=1; i <= length; i++){
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}