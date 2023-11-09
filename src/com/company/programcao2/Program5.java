package com.company.programcao2;

import java.util.Scanner;
import java.lang.Math;
//Faça um programa que receba dois números maiores que zero, calcule e mostre um elevado ao outro.
//Dica: use import java.lang.Math; com a função pow
public class Program5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        int number_1 = sc.nextInt();
        System.out.println("Insira o segundo número: ");
        int number_2 = sc.nextInt();
        int exp = (int) Math.pow(number_1, number_2);
        System.out.println("Resultado: "+ exp);


        sc.close();
    }
}
