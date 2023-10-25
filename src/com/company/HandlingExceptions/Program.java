package com.company.HandlingExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        try{
        String [] vect = sc.nextLine().split(" ");
            int postion = sc.nextInt();
            System.out.println(vect[postion]);
        }catch ( ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position");
        }catch (InputMismatchException e){
            System.out.println("Input error");
        }



        sc.close();
    }
}
