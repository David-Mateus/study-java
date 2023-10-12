package com.company.game;

import java.util.Scanner;

public class JagoDaForca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavraSecreta = "Felicidade";
        char[] letrasCertas = new char[palavraSecreta.length()];
        boolean[] letrasDescobertas = new boolean[palavraSecreta.length()];
        int tentativasRestantes = 6;

        while (tentativasRestantes > 0) {
            boolean acertou = true;

            System.out.println("\nPalavra: " + obterPalavraAtual(palavraSecreta, letrasCertas, letrasDescobertas));

            System.out.print("Tentativas restantes: " + tentativasRestantes + ". Digite uma letra: ");
            char letra = scanner.nextLine().toUpperCase().charAt(0);

            for (int i = 0; i < palavraSecreta.length(); i++) {
                if (palavraSecreta.charAt(i) == letra) {
                    letrasCertas[i] = letra;
                    letrasDescobertas[i] = true;
                }
            }

            for (boolean descoberta : letrasDescobertas) {
                if (!descoberta) {
                    acertou = false;
                    break;
                }
            }

            if (acertou) {
                System.out.println("Parabéns! Você descobriu a palavra: " + palavraSecreta);
                break;
            }

            if (palavraSecreta.indexOf(letra) == -1) {
                tentativasRestantes--;
                System.out.println("Letra incorreta. Tente novamente.");
            }
        }

        if (tentativasRestantes == 0) {
            System.out.println("\nVocê perdeu! A palavra correta era: " + palavraSecreta);
        }

        scanner.close();
    }

    private static String obterPalavraAtual(String palavraSecreta, char[] letrasCertas, boolean[] letrasDescobertas) {
        StringBuilder palavraAtual = new StringBuilder();
        for (int i = 0; i < palavraSecreta.length(); i++) {
            if (letrasDescobertas[i]) {
                palavraAtual.append(letrasCertas[i]).append(" ");
            } else {
                palavraAtual.append("_ ");
            }
        }
        return palavraAtual.toString();
    }
}