package com.company;

import java.util.Scanner;

public class MatrixProp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int linhas = sc.nextInt();
        int colunas = sc.nextInt();
        int[][] mat = new int[linhas][colunas];

        for(int c = 0; c < linhas; c++){
            for(int l = 0; l < colunas; l++){
                mat[c][l] = sc.nextInt();
            }
        }
        //pegando posicação i,j
        //pegando o numero mat[i][j]
        System.out.println("Digite um numero");
        int search = sc.nextInt();
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == search){
                    System.out.print("Position"+i+","+j+'\n');
                    if(j > 0){
                        System.out.println("Left: "+mat[i][j-1]);
                    }
                    if(i > 0){
                        System.out.println("UP: "+mat[i-1][j]);
                    }
                    if (j < mat[i].length-1) {
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if (i < mat.length-1) {
                        System.out.println("Down: " + mat[i+1][j]);
                    }

                    System.out.println("Ridht: "+mat[i][j+1]);

                }
            }
        }
        sc.close();
    }
}
