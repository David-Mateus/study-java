package com.company.Randomcode;

import java.util.Scanner;

public class Matriz {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            //tamanho da matriz
            int n = sc.nextInt();
            // criando a matriz | linha e colunas
            int[][] mat = new int[n][n];
            for(int linhas = 0; linhas < n; linhas++ ){
                for(int colunas = 0; colunas < n; colunas++){
                    mat[linhas][colunas] = sc.nextInt();
                }
            }
            //Mostra a diagonal
            int media = 0;
            for(int i = 0; i < 3; i++){
                media += mat[1][i];
            }
            sc.close();


        }

    }


