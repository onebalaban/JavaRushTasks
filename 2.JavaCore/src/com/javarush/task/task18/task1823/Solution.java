package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String fileName = reader.readLine();
            if (fileName.equals("exit")) {
                break;
            }
            new ReadThread(fileName).start();
        }
        reader.close();
    }

    public static class ReadThread extends Thread {
        String fileName;

        public ReadThread(String fileName) throws FileNotFoundException {
            this.fileName = fileName;
        }

        Map<Integer, Integer> hashMap = new HashMap<>();

        public void run() {
            try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(fileName))) {
                while (bufferedInputStream.available() > 0) {
                    int i = bufferedInputStream.read();
                    if (!hashMap.containsKey(i)) {
                        hashMap.put(i, 1);
                    } else {
                        int y = hashMap.get(i);
                        y++;
                        hashMap.put(i, y);
                    }
                }

                int maxCount = 0;

                for (Map.Entry<Integer, Integer> pair : hashMap.entrySet()
                        ) {
                    int value = pair.getValue();
                    if (value > maxCount) {
                        maxCount = value;
                    }
                }

                for (Map.Entry<Integer, Integer> pair : hashMap.entrySet()
                        ) {
                    int value = pair.getValue();
                    int key = pair.getKey();
                    if (value == maxCount){ //we can't put equals keys in map, but validator wants this. wtf?
                        synchronized (Solution.class) {
                            resultMap.put(fileName, key);
                        }
                    }

                }



            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
