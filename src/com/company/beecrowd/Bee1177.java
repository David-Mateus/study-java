package com.company.beecrowd;

import java.util.Scanner;

public class Bee1177 {
    public static void main(String[] args) {

        // a sacada da questão é usar resto da divisão
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[100];
        int input = sc.nextInt();
        for(int i = 0; i < vector.length; i++){
            vector[i] = i % input;
        }
        for (int z = 0; z < 100; z++){
            System.out.println(vector[z]);
        }


        sc.close();
    }
}
