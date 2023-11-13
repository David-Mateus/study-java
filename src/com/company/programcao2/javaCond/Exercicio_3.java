package com.company.programcao2.javaCond;
//Faça um programa que receba um número inteiro e verifique se esse número é par ou ímpar.
import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número:");
        int input_1 = sc.nextInt();


        if (input_1 % 2 == 0) {
            System.out.println(input_1+" é par.");
        } else {
            System.out.println(input_1+" é impar.");
        }

        sc.close();
    }
}
