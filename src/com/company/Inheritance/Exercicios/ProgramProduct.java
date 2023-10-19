package com.company.Inheritance.Exercicios;

import javax.swing.*;
import java.util.*;

public class ProgramProduct {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();
        System.out.print("Enter the number of products: ");
        int input = sc.nextInt();
        for(int i = 1; i <= input; i++){
            System.out.println("Product #"+i+" data:");
            System.out.print("Cammon, used or imported(c/u/i) ?");
            char caractere = sc.next().charAt(0);
            System.out.print("Name");
            sc.nextLine();
            String name = sc.next();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if(caractere == 'i'){
                Double customFree = sc.nextDouble();
                Product pro = new ImportedProduct(name, price, customFree);
                list.add(pro);
            }else if(caractere == 'c'){
                Product pro = new Product(name, price);
            }else if(caractere == 'u'){
                System.out.println("Manufacture date (DD/MM/YYYY)");
                String date = sc.next();
                Product pro = new UsedProduct(name, price, date);
                list.add(pro);
            }

            for(Product pro : list){
                pro.priceTag();
            }

        }

        sc.close();
    }

}
