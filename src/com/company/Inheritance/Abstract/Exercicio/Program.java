package com.company.Inheritance.Abstract.Exercicio;

import com.company.Inheritance.Abstract.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Pessoa> list = new ArrayList<>();
        System.out.print("Enter the number of tax payers: ");
        int input = sc.nextInt();
        for(int i = 1; i <= input; i++){
            System.out.println("Tax payer #"+i+" data");
            System.out.print("F ou J: ");
            char escolha = sc.next().charAt(0);
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Renda anual: ");
            double rendaAnual = sc.nextDouble();
            if(escolha == 'F'){
                System.out.print("Gasto com saude: ");
                double saude = sc.nextDouble();
                Pessoa fisica = new Fisica(TipoPersona.FISICA,nome, rendaAnual, saude);
                list.add(fisica);
            }else{
                System.out.print("Quantos funcionarios: ");
                int func = sc.nextInt();
                Pessoa juridico = new Juridica(TipoPersona.JURIDICA,nome, rendaAnual, func);
                list.add(juridico);
            }
        }
        System.out.println("TAXES PAID: ");
        for(Pessoa pessoa : list){
            System.out.println(pessoa.getPersona()+" $ "+ String.format("%.2f",pessoa.tax()));
        }
        double sum = 0.0;
        System.out.println("Total de taxa: ");
        for(Pessoa soma : list){
            sum += soma.tax();
        }
        sc.close();
    }
}
