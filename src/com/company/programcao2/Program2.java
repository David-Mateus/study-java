package com.company.programcao2;

import java.util.Scanner;
//(2) Faça um programa que receba três notas, calcule e mostre a média aritmética entre elas.
public class Program2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double note_1 = sc.nextDouble();
        double note_2 = sc.nextDouble();
        double note_3 = sc.nextDouble();
        double average = (note_1 + note_2 + note_3)/3;
        System.out.println("Média aritmética: "+average);
        sc.close();
    }
}
