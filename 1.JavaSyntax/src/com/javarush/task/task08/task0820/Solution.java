package com.javarush.task.task08.task0820;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();

        for (int i = 0; i < 4; i++) {
            Cat cat = new Cat();
            result.add(cat);
        }

        return result;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> result = new HashSet<Dog>();

        for (int i = 0; i < 3; i++) {
            Dog dog = new Dog();
            result.add(dog);
        }

        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        HashSet join = new HashSet();
        for (Cat x: cats
             ) {
            Collections.addAll(join,x);
        }
        for (Dog x: dogs
                ) {
            Collections.addAll(join,x);
        }
        return join;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        Iterator iteratorPet = pets.iterator();
        while (iteratorPet.hasNext()) {
            if (cats.contains(iteratorPet.next())){
                iteratorPet.remove();
            }
        }
    }

    public static void printPets(Set<Object> pets) {
        for (Object x: pets
             ) {
            System.out.println(x);
        }
        }


    public static class Cat{

    }

    public static class Dog{

    }
}
