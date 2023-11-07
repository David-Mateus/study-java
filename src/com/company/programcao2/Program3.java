package com.company.programcao2;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o salário: ");
        int salary = sc.nextInt();
        int increase = (int) (salary * 0.25);
        System.out.println("Novo salario: " + (salary + increase));
        sc.close();
    }
}
