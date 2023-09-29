package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilesCSV {
    public static void main(String[] args) throws Exception{

        List<DataCSV> csvData = new ArrayList<>();

        try(Scanner sc = new Scanner(new File("C:\\server\\input.csv"))){
            sc.useDelimiter(",");
            while (sc.hasNext()){
                String name = sc.next();
                double price = Double.parseDouble(sc.next());
                double quantity =  Double.parseDouble(sc.next());
                DataCSV data = new DataCSV(name, price, quantity);
                csvData.add(data);
            }
            // Agora a lista csvData contém os elementos do CSV
            for (int i = 0; i < csvData.size(); i++) {
                System.out.println("Elemento " + i + ": " + csvData.get(i).getPrice() * csvData.get(i).getQtd());
            }

        }catch (IOException e){
            e.printStackTrace();
        }

//        String path = "C:\\server\\sumary.txt";
//        try(BufferedWriter bw = new BufferedWriter(new java.io.FileWriter(path, true))) {
//            for(String line : csvData){
//
//            }
//        }catch (IOException e){
//            e.printStackTrace();
//        }



    }
}
