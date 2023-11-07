package com.company.programcao2;

import java.util.Scanner;
//sequencial
//(1) Faça um programa que receba quatro
//números inteiros, calcule e mostre a soma desses números.
public class Program {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int value_1 = sc.nextInt();
        int value_2 = sc.nextInt();
        int value_3 = sc.nextInt();
        int value_4 = sc.nextInt();

        int sum = (value_1 + value_2 + value_3 + value_4);
        System.out.println("Resultado da soma: " +sum);
        sc.close();
    }
}
