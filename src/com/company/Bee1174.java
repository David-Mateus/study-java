package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Bee1174 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] vect = new double[4];
        for(int i = 0; i < vect.length; i++){
            vect[i] = sc.nextDouble();
        }
        for(int vct = 0; vct < vect.length; vct++){
            if(vect[vct] < 10){
                System.out.printf("A[%d] = %.1f\n", vct, vect[vct]);
            }
        }

        sc.close();
    }
}
