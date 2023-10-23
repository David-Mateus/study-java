package com.company.Inheritance.Abstract;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();
        System.out.print("Enter the number of shapes: ");
        int input = sc.nextInt();
        for (int i = 1; i <= input; i++){
            System.out.println("Shape #"+i+" data: ");
            System.out.print("Rectangle or Circle(r/c)? ");
            char typeShape = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED)");
            Color choiceColor = Color.valueOf(sc.next());

            if(typeShape == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                Shape rec = new Rectangle(choiceColor,width, height);
                list.add(rec);
            }else{
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                Shape cir = new Circle(choiceColor, radius);
                list.add(cir);
            }


        }
        System.out.println("SHAPE AREAS: ");
        for (Shape shape : list){
            System.out.println(String.format("%.2f", shape.area( )));
        }
        sc.close();
    }
}
