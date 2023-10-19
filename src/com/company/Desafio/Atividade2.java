package com.company.Desafio;

import java.util.Scanner;
//No terminal você deve entrar com os dados 3 6
public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aCount = sc.nextInt();
        int bCount = sc.nextInt();
        StringBuilder sequence = new StringBuilder();

        while (aCount > 0 || bCount > 0) {
            if (aCount >= bCount) {
                if (aCount > 2) {
                    sequence.append("a");
                    aCount -= 2;
                } else {
                    sequence.append("a".repeat(aCount));
                    aCount = 0;
                }
            } else {
                if (bCount > 2) {
                    sequence.append("b");
                    bCount -= 2;
                } else {
                    sequence.append("b".repeat(bCount));
                    bCount = 0;
                }
            }
        }

        System.out.println(sequence.toString());
        sc.close();
    }
}
