package com.company;


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Sequencial - 1012
        // repetição 1061
        Scanner sc = new Scanner(System.in);
//        int entrada = sc.nextInt();
//        int numCobaia;
//        double coelho = 0, ratos = 0, sapos = 0, countTotal = 0;
//        String nameCobaia;
//
//        for (int i = 0; i < entrada; i++){
//            numCobaia = sc.nextInt();
//            nameCobaia = sc.next();
//
//            if(nameCobaia.charAt(0) == 'C'){
//                countTotal+=numCobaia;
//                coelho+=numCobaia;
//
//            }else if(nameCobaia.charAt(0) == 'R'){
//                countTotal+=numCobaia;
//                ratos+=numCobaia;
//            }else{
//                countTotal+=numCobaia;
//                sapos+=numCobaia;
//            }
//
//        }
//        double totalCoelho = 100*coelho/countTotal;
//        double totalRatos = 100*ratos/countTotal;
//        double totalSapos = 100*sapos/countTotal;
//        System.out.printf("Total: %d\n Total de coelhos: %d\n Total de ratos: %d\n Total de sapos: %d\n");
//        System.out.printf("Percentual de coelhos: %.2f\n ", totalCoelho);
//        System.out.printf("Percentual de ratos: %.2f\n ", totalCoelho);
//        System.out.printf("Percentual de sapos: %.2f\n ", totalCoelho);

//        int number1;
//        number = sc.nextInt();
//        if(number > 0){
//            System.out.println("NAO NEGATIVO");
//        }else{
//            System.out.println("NEGATIVO");
//        }
//
//        number = sc.nextInt();
//        if(number % 2 == 0){
//            System.out.println("PAR");
//        }else{
//            System.out.println("IMPAR");
//        }
//
//        number1 = sc.nextInt();
//        number2 = sc.nextInt();
//        if(number1 > number2){
//            if(number1 % number2 == 0){
//                System.out.println("São multiplos");
//            }else {
//                System.out.println("Não São multiplos");
//            }
//        }else{
//            if(number2 % number1 == 0){
//                System.out.println("São multiplos");
//            }else {
//                System.out.println("Não São multiplos");
//            }
//        }
//        number1 = sc.nextInt();
//        number2 = sc.nextInt();
//        int duracao;
//        if(number1 < number2){
//            duracao = number2 - number1;
//        }else {
//            duracao = 24 - number1 + number2;
//        }
//        System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
//        number1 = sc.nextInt();
//
//           while (number1 != 2002){
//                System.out.println("senha invalida");
//                number1 = sc.nextInt();
//           }
//           System.out.println("Acesso permitido");
//        number1 = sc.nextInt();
//        number2 = sc.nextInt();
//        while (number1 != 0 && number2 != 0) {
//            if (number1 > 0 && number2 > 0) {
//                System.out.println("Primeirp");
//            } else if (number1 < 0 && number2 > 0) {
//                System.out.println("Segundo");
//            } else if (number1 > 0 && number2 < 0) {
//                System.out.println("quarto");
//            } else {
//                System.out.println("terceiro");
//            }
//            number1 = sc.nextInt();
//            number2 = sc.nextInt();
//        }
//        int alcool = 0;
//        int gasolina = 0;
//        int diesel = 0;
//
//        number1 = sc.nextInt();
//        while(number1 != 4){
//
//            if(number1 == 1){
//                alcool += 1;
//            }else if(number1 == 2){
//                gasolina += 1;
//            }else if(number1 == 3){
//                diesel += 1;
//            }
//            number1 = sc.nextInt();
//        }
//
//        System.out.println(alcool);
//        System.out.println(gasolina);
//        System.out.println(diesel);
//        int x = sc.nextInt();
//        int soma = 0;
//        for(int i = 0; i < x; i++){
//            number1 = sc.nextInt();
//            soma += number1;
//
//        }
//        System.out.println(soma);
//        number1 = sc.nextInt();
//        for(int i = 1; i <= number1; i++){
//            System.out.printf("%d %d %d%n", i, i*i, i*i*i);
//        }
//        int n = sc.nextInt();
//        for(int i = 1; i <= n; i++){
//            if (n % i == 0){
//                System.out.println(i);
//            }
//        }
//        number1 = sc.nextInt();
//        int fat = 1;
//        for (int i = 1; i <= number1; i++){
//            fat = fat * i ;
//        }
//        System.out.println(fat);
//        Triangle x, y;
//        x = new Triangle();
//        y = new Triangle();
//        System.out.println("Enter the measures of triangle X: ");
//        x.a = sc.nextDouble();
//        x.b = sc.nextDouble();
//        x.c = sc.nextDouble();
//
//        System.out.println("Enter the measures of triangle Y: ");
//        y.a = sc.nextDouble();
//        y.b = sc.nextDouble();
//        y.c = sc.nextDouble();
//
//
//        double totalX = x.area();
//        double totalY = y.area();
//        System.out.printf("Larger area %.4f%n", totalX);
//        System.out.printf("Larger area %.4f%n", totalY);
//        if(totalX > totalY){
//            System.out.println("Larger area X");
//        }else{
//            System.out.println("Larger area Y");
//        }
//        Product x;
//        x = new Product();
//        System.out.println("Enter product data: ");
//
//        x.name = sc.next();
//        x.price = sc.nextDouble();
//        x.quantity = sc.nextInt();
//
//        System.out.println(x.toString());
//        x.addProducts(10);
//        System.out.println(x.toString());
//           Rectangle x;
//           x = new Rectangle();
//           System.out.println("Enter rectangle width and height");
//           x.width = sc.nextDouble();
//           x.height = sc.nextDouble();
//           System.out.println(x.toString());

//        Employee employee;
//        employee = new Employee();
//        System.out.printf("Name: ");
//        employee.name = sc.nextLine();
//        System.out.printf("Gross salary: ");
//        employee.grossSalary = sc.nextDouble();
//        System.out.printf("Tax: ");
//        employee.tax = sc.nextDouble();
//
//        System.out.printf("Employee: %s, $ %.2f%n", employee.name, employee.netSalary());
//
//        System.out.println("Which percentage to increase salary? ");
//        double taxa = sc.nextDouble();
//        employee.increaseSalary(taxa);
//        System.out.printf("Updated data: %s, $ %.2f", employee.name,employee.netSalary() );
//
//        Student aluno;
//        aluno = new Student();
//        aluno.name = sc.next();
//        aluno.nota1 = sc.nextDouble();
//        aluno.nota2 = sc.nextDouble();
//        aluno.nota3 = sc.nextDouble();
//
//        System.out.println("FINAL GRADE = " + aluno.allNotas());
//        if(aluno.allNotas() < 60.0){
//            System.out.println("Failed");
//            System.out.println("Missing "+aluno.pointsResult()+" Points");
//        }else{
//            System.out.println("Pass");
//        }
////
//        Ip address;
//        address = new Ip();
//        address.ip = sc.next();
//        System.out.println(address.ipAddress());

//        Temperature temp;
//        temp = new Temperature();
//        temp.temp = sc.nextDouble();
//        System.out.println(temp.resultTemperatureF());
//        int entrada = sc.nextInt();
//
//        for(int i = 0; i < entrada; i++){
//            double PA, PG, G1, G2;
//            PA = sc.nextDouble();
//            PG = sc.nextDouble();
//            G1 = sc.nextDouble();
//            G2 = sc.nextDouble();
//
//
//            int anos = 0;
//            while (PA <= PG){
//
//                PA += Math.floor(PA * (G1/100));
//                PG += Math.floor(PG * (G2/100));
//
//                anos+=1;
//
//            }
//            if(anos > 100){
//                System.out.println("Mais de 1 seculo.");
//            }else{
//                System.out.println(anos + " anos.");
//            }
//
//        }
//        int entrada2 = sc.nextInt();
//        for(int i = 0; i < entrada2; i++){
//
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//
//            if(x < y){
//                for(int t = 0; t < y; t++){
//                    if(t > x && t < y){
//                        if(t % 2 != 0){
//                            System.out.println(t);
//                        }
//                    }
//
//                }
//            }
//        }
//
//        int entrada = sc.nextInt();
//        int[] vetor = new int[entrada];
//
//        for(int i = 0; i < vetor.length; i++){
//            vetor[i] = sc.nextInt();
//        }
//        int menor = vetor[0];
//        int maior = 9999;
//        int posicao = -1;
//        for(int i = 0; i < vetor.length;i++){
//
//            if(vetor[i] < menor){
//                menor = vetor[i];
//                posicao = i;
//            }else{
//                maior = vetor[i];
//
//            }
//
//        }
//        System.out.println(menor+"=="+posicao+""+"=="+maior);
//        int n = sc.nextInt();
//        for(int i = 0; i < n; i++){
//            int fat = 0;
//
//        }
//       int n = sc.nextInt();
//       int fat; int numA = 0; int numB = 1;
//       for(int i = 0; i < n; i++){
//           fat = numA + numB;
//           numB = numA;
//           numA = fat;
//           System.out.println(fat);
//       }
//        int a, b ,c;
//        a = 7;
//        b = 6;
//        c = 5;
//        for(int i = 1; i < 20 ; i = i + 2){
//
//            System.out.printf("%d, %d, %d J=%d, J=%d, J=%d", i, i, i, a, b, c);
//        }
//
//        int i = 1;
//       while(i != 0){
//           int ano = sc.nextInt();
//           if(ano == 2002){
//               System.out.println("Acesso");
//               i = 0;
//           }else{
//               System.out.println("Acesso negado");
//           }
//       }
//        int j = 1;
//        while (j != 0){
//            int entrada = sc.nextInt();
//            for(int i = 1; i <= entrada; i++){
//                System.out.printf("%d ",i);
//            }
//            int b = sc.nextInt();
//            entrada = b;
//            if(entrada == 0){
//                j = 0;
//            }
//        }
//

//        int count = 0;
//        int j = 0;
//        double entrada = sc.nextDouble();
//        while (entrada > 0){
//            entrada = sc.nextDouble();
//            count += entrada;
//            j+=1;
//        }
//        double media = count;
//        System.out.println(media);



    }



}
