package com.company.Randomcode;

import java.io.File;
import java.util.Scanner;

public class ProgramWrite {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);
        //Só nome do arquivo
        System.out.println("GetName: "+ path.getName());
        //Só caminho
        System.out.println("getParent: "+ path.getParent());
        //Todo camiho
        System.out.println("Getpath: "+ path.getPath());
        sc.close();
    }
}
