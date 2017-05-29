package com.javarush.task.task18.task1812;

import java.io.*;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {

    private AmigoOutputStream instance;

    public QuestionFileOutputStream(AmigoOutputStream instance) {
        this.instance = instance;
    }

    public void flush() throws IOException {
        instance.flush();
    }

    public void write(int b) throws IOException {
        instance.write(b);
    }

    public void write(byte[] b) throws IOException {
        instance.write(b);
    }

    public void write(byte[] b, int off, int len) throws IOException {
        instance.write(b, off, len);
    }

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void close() throws IOException {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        String answer = reader.readLine();
        if (answer.equals("Д")) {
            reader.close();
            instance.close();
        }
    }


}

