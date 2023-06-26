package com.dev.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStreamExample {
        /*  TODO-List
            *  create object
            *  read data into file
            *  close the stream
         */

    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\SHr-JAVA\\OutputStream\\MARVEL.txt");
            int idx = 0;

            while ((idx = fileInputStream.read()) != -1){
                System.out.print((char) idx);
            }
            System.out.println();
            fileInputStream.close();
            System.out.println("Successfully readed");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

}
