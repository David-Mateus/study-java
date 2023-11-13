package com.company.programcao2.javaCond;

import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira primeiro número:");
        int input_1 = sc.nextInt();
        System.out.println("Insira primeiro número:");
        int input_2 = sc.nextInt();


        if (input_1 == input_2) {
            System.out.println("Multiplicação: "+(input_1 * input_2));
        } else if(input_1 > input_2) {
            System.out.println("Subtração:"+(input_1 - input_2));
        }else {
            System.out.println("Soma:"+(input_1 + input_2));
        }

        sc.close();
    }
}
