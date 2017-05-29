package com.javarush.task.task18.task1814;

import java.io.*;
import java.nio.file.Files;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {

    private FileInputStream original;

    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {
        super(fileName);
        if (getFileExtension(fileName).equals("txt")) {
            this.original = new FileInputStream(fileName);
        }
        else {
            super.close();
            throw new UnsupportedFileNameException();
        }
    }

    private static String getFileExtension(String fileName) {
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            return fileName.substring(fileName.lastIndexOf(".")+1);
        else return "";
    }

    public static void main(String[] args) {
    }
}

