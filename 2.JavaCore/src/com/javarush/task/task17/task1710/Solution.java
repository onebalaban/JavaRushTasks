package com.javarush.task.task17.task1710;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        int id;
        String name;
        String sex;
        String bd;
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        DateFormat out = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        Date birthDay;

        switch (args[0]) {
            case "-c":
                name = args[1];
                sex = args[2];
                bd = args[3];
                birthDay = df.parse(bd);
                if (sex.equals("м")) {
                    allPeople.add(Person.createMale(name, birthDay));
                } else {
                    allPeople.add(Person.createFemale(name, birthDay));
                }
                System.out.println(allPeople.size()-1);
                break;
            case "-u":
                id = Integer.parseInt(args[1]);
                name = args[2];
                sex = args[3];
                bd = args[4];
                birthDay = df.parse(bd);
                if (sex.equals("м")) {
                    allPeople.get(id).setBirthDay(birthDay);
                    allPeople.get(id).setName(name);
                    allPeople.get(id).setSex(Sex.MALE);
                } else {
                    allPeople.get(id).setBirthDay(birthDay);
                    allPeople.get(id).setName(name);
                    allPeople.get(id).setSex(Sex.FEMALE);
                }
                break;
            case "-d":
                id = Integer.parseInt(args[1]);
                allPeople.get(id).setBirthDay(null);
                allPeople.get(id).setName(null);
                allPeople.get(id).setSex(null);
                break;
            case "-i":
                id = Integer.parseInt(args[1]);
                String printSex;
                if (allPeople.get(id).getSex().equals(Sex.MALE)){
                    printSex = "м";
                }
                else{
                    printSex = "ж";
                }

                System.out.println(allPeople.get(id).getName() + " " + printSex + " " + out.format((allPeople.get(id).getBirthDay())));
                break;
        }
    }
}
