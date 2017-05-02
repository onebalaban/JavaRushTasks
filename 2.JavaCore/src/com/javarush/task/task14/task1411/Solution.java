package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Looser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        while (true){
            String temp = reader.readLine();
            if (!(temp.equals("user")) && !(temp.equals("loser")) && !(temp.equals("coder")) && !(temp.equals("proger"))){
                break;
            }
            if (temp.equals("user")){
                person = new Person.User();
            }
            if (temp.equals("loser")){
                person = new Person.Loser();
            }
            if (temp.equals("coder")){
                person = new Person.Coder();
            }
            if (temp.equals("proger")){
                person = new Person.Proger();
            }

            doWork(person); //вызываем doWork

        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User){
            ((Person.User) person).live();
        }
        if (person instanceof Person.Loser){
            ((Person.Loser) person).doNothing();
        }
        if (person instanceof Person.Coder){
            ((Person.Coder) person).coding();
        }
        if (person instanceof Person.Proger){
            ((Person.Proger) person).enjoy();
        }
    }
}
