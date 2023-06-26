package com.dev.io;

import java.io.FileOutputStream;

public class FileOutStreamExample {
        /*  TODO-List
            *  create object
            *  write data into file
            *  close the stream
         */

    public static void main(String[] args) {
        try {
            //using write(int)
            /* FileOutputStream fileOutputStream = new FileOutputStream("D:\\SHr-JAVA\\OutputStream\\sample.txt");
           fileOutputStream.write(65);
            fileOutputStream.close();*/

            //using write(byte[])
            FileOutputStream fileOutputStream = new FileOutputStream("D:\\SHr-JAVA\\OutputStream\\MARVEL.txt");
            String statement = "I am IRONMAN";
            fileOutputStream.write(statement.getBytes());
            fileOutputStream.close();

            System.out.println("Successfully created");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

}
