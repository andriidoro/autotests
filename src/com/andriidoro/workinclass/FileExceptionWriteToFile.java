package com.andriidoro.workinclass;


import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.*;

public class FileExceptionWriteToFile{
    public static void main(String[] args)  throws IOException{
        String firstLine = "The first line";
        String secondLine = "The second line";
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\tafin\\Desktop\\output.txt")));
        writer.append(firstLine);
        writer.newLine();
        writer.append(secondLine);
        writer.close();
    }
}
