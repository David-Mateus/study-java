package com.company.programcao2.javaCond;

import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("---|CALCULADORA|---\nDigite 1 pra somar;\nDigite 2 para subtrair;\nDigite 3 para multiplicar;\nDigite 4 para dividir;");
        System.out.println("Informe um valor:");
        int choice = sc.nextInt();
        System.out.println("Insira primeiro número:");
        int input_1 = sc.nextInt();
        System.out.println("Insira segundo número:");
        int input_2 = sc.nextInt();
        if (choice == 1) {

            System.out.println("Soma: "+(input_1+input_2));
        } else if(choice == 2) {

            System.out.println("Subtração: "+(input_1-input_2));
        }else if(choice == 3) {

            System.out.println("Multiplicação: "+(input_1*input_2));
        }else {

                if(input_1 >= 0 && input_2 >0){
                    System.out.println("Divisão: "+(input_1 / input_2));
                }else {
                    System.out.println("Divisão por zero.");
                }
        }

        sc.close();
    }
}
