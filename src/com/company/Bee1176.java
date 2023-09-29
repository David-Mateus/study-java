package com.company;


import java.util.Scanner;

public class Bee1176 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int[] vectorFib = new int[60];
        // variaveis bases para fibonacci(0, 1)
        int numA = 0, numB = 1;

        for(int i = 0; i < vectorFib.length; i++){
            vectorFib[i] = numA; // Adicionar no vetor o valor zero para iniciar.Tambem adicionar
            int nextFib= numA + numB; // somar o valores
            numA = numB; // vai receber valor anterior, ou seja o valor de B
            numB = nextFib; // B vai receber o valor da soma
        }
        for(int z = 0; z < input; z++){
            int findNum = sc.nextInt();
            System.out.println("Fib "+vectorFib[findNum]); // vai buscar o valor solicitado pelo index do vetor
        }

        sc.close();
    }
}
