package com.company.programcao2;

import java.util.Scanner;
//Faça um programa que calcule e mostre a área de um triângulo. Sabe-se que: Área = (base * altura)/2.
public class Program4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a base: ");
        int base = sc.nextInt();
        System.out.println("Insira a altura: ");
        int altura = sc.nextInt();

        int area = (base * altura)/2;
        System.out.println("Area do triangulo: "+area);

        sc.close();
    }
}
