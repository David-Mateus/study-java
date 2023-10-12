package com.company.Randomcode;

import java.util.Scanner;

public class Vetor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[10];
        for(int i = 0; i < vector.length; i++){
            vector[i] = sc.nextInt();
        }
        for(int y = 0; y < vector.length; y++){
            if(vector[y] < 0){
                System.out.printf("X[%d] = 63\n", y );
            }else{
                System.out.printf("X[%d] = 1\n", y );
            }
        }
        sc.close();
    }
}
