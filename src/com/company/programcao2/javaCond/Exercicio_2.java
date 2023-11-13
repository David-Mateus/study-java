package com.company.programcao2.javaCond;

import java.util.Scanner;
//Desenvolva um algoritmo que receba três números. O algoritmo deve imprimir "Condição satisfeita", na tela, caso o primeiro dado inserido seja maior do que os outros dois (o primeiro não pode ser igual a nenhum). Caso contrário, deve ser impressa a mensagem: "Erro".
public class Exercicio_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro número:");
        int input_1 = sc.nextInt();
        System.out.println("Insira o segundo numero:");
        int input_2 = sc.nextInt();
        System.out.println("Insira o terceiro numero:");
        int input_3 = sc.nextInt();

        if (input_1 > input_2 && input_1 > input_3 && input_2 > input_3) {
            System.out.println("Condição satisfeita");
        } else {
            System.out.println("Erro");
        }

        sc.close();
    }
}
