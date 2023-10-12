package com.company.beecrowd;

import java.util.Scanner;

public class Bee1180 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] vetor = new int[input];
        int count = 0;
        int menor = 9999;
        for(int i = 0; i < vetor.length ; i++){
            vetor[i] = sc.nextInt();
        }
        for(int z = 0; z < vetor.length; z++){
            if(vetor[z] < menor){
                count++;
                menor = vetor[z];

            }
        }
        System.out.println("Menor valor: "+menor);
        System.out.println("Posição: "+count);
        sc.close();
    }
}