package com.company.beecrowd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bee1179 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vectorPar = new int[5];
        int[] vectorImpar = new int[5];
        int qtdPar = 0;
        int qtdImpar = 0;

        for (int i = 0; i < 15; i++) {
            int value = sc.nextInt();

            if (value % 2 == 0) {
                vectorPar[qtdPar] = value;
                qtdPar++;

            } else {
                vectorImpar[qtdImpar] = value;
                qtdImpar++;

            }

            if(qtdPar == 5){
                qtdPar = 0;
                for(int j = 0; j < vectorPar.length; j++ ){
                    System.out.println("par["+j+"] = " + vectorPar[j]);
                }
            }else if(qtdImpar == 5){
                qtdImpar = 0;
                for(int j = 0; j < vectorImpar.length; j++ ){
                    System.out.println("Impar["+j+"] = " + vectorImpar[j]);
                }
            }
        }

        for(int i = 0; i < 15; i++){
            System.out.println("impar["+i+"] = " + vectorImpar[i]);
        }
        for(int i = 0; i < 15; i++){
            System.out.println("Impar["+i+"] = " + vectorPar[i]);
        }


        sc.close();
    }
}
