package com.company.Randomcode;


import java.io.BufferedWriter;
import java.io.IOException;

public class FileWriter {
    public static void main(String[] args){
        String[] lines = new String[]{"Good morning", "Good aftermoon", "Good night"};

        String path = "C:\\server\\out.txt";

        try(BufferedWriter bw = new BufferedWriter(new java.io.FileWriter(path, true))) {
            for(String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
