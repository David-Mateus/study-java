package com.company.beecrowd;

import java.util.Scanner;

public class Bee1178 {
    public static void main(String[] args) {

        // a sacada da questão é usar resto da divisão
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[100];
        int input = sc.nextInt();

        for(int i = 0; i < vector.length; i++){
           vector[i] = input/2;
           input = vector[i];
        }
        for (int z = 0; z < vector.length; z++){
            System.out.println(vector[z]);
        }

        sc.close();
    }
}
