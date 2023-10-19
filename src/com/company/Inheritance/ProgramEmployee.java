package com.company.Inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

//      Employee[] vector = new Employee[input];
        List<Employee> list =  new ArrayList<>();

        System.out.print("Enter the number of emplyees: ");
        int input = sc.nextInt();

        for(int i = 1; i <= input; i++){
            System.out.println("Employee #"+i+" data:");
            System.out.println("Outsourced(Y/N) ?");
            char resp = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hour = sc.nextInt();
            System.out.print("Value per hour: ");
            double valueHour = sc.nextDouble();

            if(resp == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                Employee emp = new OutsourcedEmployee(name, hour,valueHour, additionalCharge);
                list.add(emp);
            }else{
                Employee emp = new Employee(name, hour, valueHour);
                list.add(emp);
            }
        }
        System.out.println("Payments: ");
        for(Employee emp : list){
            System.out.println(emp.getName() +"-"+ emp.payment());
        }
        sc.close();
    }
}
