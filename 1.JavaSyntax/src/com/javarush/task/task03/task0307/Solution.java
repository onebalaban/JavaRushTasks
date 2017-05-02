package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Zerg zerg = new Zerg();
            zerg.name = "zzzerg"+i;
        }

        for (int i = 0; i < 5; i++) {
            Protoss protoss = new Protoss();
            protoss.name = "protossss"+i;
        }

        for (int i = 0; i < 12; i++) {
            Terran terran = new Terran();
            terran.name = "terrannn"+i;
        }
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
