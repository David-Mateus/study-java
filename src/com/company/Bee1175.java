package com.company;


import java.util.Scanner;

public class Bee1175 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int[] vect = new int[4];

        for(int i = 0; i < vect.length; i++){
            vect[i] = sc.nextInt();
        }

        for(int vct = 0; vct < vect.length/2; vct++){
            // recebe e armazena primeiro valor
            int temp = vect[vct];
//            // primeiro valor comapra com ultimo
            vect[vct] = vect[vect.length - vct - 1];
//            // o ultimo valor passa a ser o primeiro cmparado com primeiro
            vect[vect.length - vct - 1] = temp;


        }
        for(int num : vect){
            System.out.print(num + " ");
        }

        sc.close();
    }
}
