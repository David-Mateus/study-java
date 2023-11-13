package com.company.programcao2.javaCond;

import java.util.Scanner;
//Faça um programa que receba dois números e mostre o maior deles. Caso eles sejam iguais, deve-se mostrar a mensagem "Os números são iguais".
public class Exercicio_1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro número:");
        int input_1 = sc.nextInt();
        System.out.println("Insira o segundo numero:");
        int input_2 = sc.nextInt();

        if(input_1 > input_2){
            System.out.println("O maior é: "+input_1);
        } else if (input_2 > input_1) {
            System.out.println("O maior é: "+input_2);
        }else{
            System.out.println("Os números são iguais");
        }

        sc.close();
    }
}
