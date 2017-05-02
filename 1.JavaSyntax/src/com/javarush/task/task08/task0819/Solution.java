package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        Iterator<Cat> iterator = cats.iterator();
        while (iterator.hasNext()){
            Cat cat = iterator.next();
            if (cat.name.equals("aa")){
                iterator.remove();
            }
        }

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> catSet = new HashSet<>();
        Cat cat1 = new Cat("aa");
        Cat cat2 = new Cat("bb");
        Cat cat3 = new Cat("cc");
        catSet.add(cat1);
        catSet.add(cat2);
        catSet.add(cat3);
        return catSet;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat x:cats
             ) {
            System.out.println(x);
        }
    }

    public static class Cat{
        String name;
        Cat(String name){
            this.name = name;
        }
        @Override
        public String toString() {
            return name;
        }
    }
}
