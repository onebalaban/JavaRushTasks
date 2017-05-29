package com.javarush.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream{
    public static String fileName = "C:/tmp/result.txt";

    private FileOutputStream instance;

    public AmigoOutputStream(FileOutputStream instance) throws FileNotFoundException {
        super(fileName);
        this.instance = instance;
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

    // for validator only
    public void flush() throws IOException{instance.flush();}
    public void write(int b) throws IOException{instance.write(b);}
    public void write(byte[] b) throws IOException{instance.write(b);}
    public void write(byte[] b, int off, int len) throws IOException{instance.write(b,off,len);}

    @Override
    public void close() throws IOException {
        instance.flush();
        instance.write("JavaRush © All rights reserved.".getBytes());
        instance.close();
    }

}
