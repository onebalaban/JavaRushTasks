package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {

        Human human1 = new Human("Вася", true, 15);
        Human human2 = new Human("Лена ", true, 16);
        Human human3 = new Human("Саша", true, 17);
        Human human4 = new Human("Алексей", true, 18);
        Human human5 = new Human("Вадик", false, 28, human1, human2);
        Human human6 = new Human("Лена", false, 28, human3, human2);
        Human human7 = new Human("Катя", false, 28, human3, human2);
        Human human8 = new Human("Оля", false, 28, human4, human2);
        Human human9 = new Human("Настя", false, 28, human4, human2);

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        System.out.println(human4);
        System.out.println(human5);
        System.out.println(human6);
        System.out.println(human7);
        System.out.println(human8);
        System.out.println(human9);
    }

    public static class Human {

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = true;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = true;
            this.father = father;
            this.mother = mother;
        }

        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















