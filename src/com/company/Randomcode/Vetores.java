package com.company.Randomcode;


import java.util.Locale;
import java.util.Scanner;

public class Vetores {
    // Vetor - arranjos unidimensionais(Dados do mesmo tipo, ordenado, alocado de um vez so
    //vantagens: acesso imediato
    //desvantagens: Tamanho fixo, dificulcade de realizar inserções e deleções - custoso

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
//        double sum = 0;
//        int input = sc.nextInt();
//        double[] vect = new double[input];
//
//        for(int i = 0; i < input; i++){
//             vect[i] = sc.nextDouble();
//        }
//        for(int j = 0; j < vect.length; j++){
//            sum += vect[j];
//
//        }
//        double media = sum/input;
//        System.out.printf("AVERAGE HEIGHT = %.2f", media);
//        int input = sc.nextInt();
//        Vetores2[] product = new Vetores2[input];
//
//        for(int i = 0; i < input; i++){
//
//            String name = sc.next();
//            double price = sc.nextDouble();
//            product[i] = new Vetores2(name, price);
//        }
//        double sum = 0;
//        for(int j = 0; j < product.length; j++){
//            sum += product[j].getPrice();
//        }
//        double media = sum/input;
//        System.out.println(media);
//        int input = sc.nextInt();
////        Negative[] number = new Negative[input];
////        for(int i = 0; i < input; i++){
////            int numbers = sc.nextInt();
////            number[i] = new Negative(numbers);
////        }
////        for(int j = 0; j < number.length; j++){
////            if(number[j].getNumber() < 0){
////                System.out.println(number[j].getNumber());
////            }
////        }
//        int input = sc.nextInt();
//        double[] vect = new double[input];
//        for(int i = 0; i < input; i++){
//            vect[i] = sc.nextDouble();
//        }
//        double sum = 0.0;
//
//        for(int j = 0; j < vect.length; j++){
//            sum+= vect[j];
//
//        }
//        double media = sum/input;
//        System.out.printf("SOMA %.2f", sum);
//        System.out.printf("Media %.2f", media);

//        int input = sc.nextInt();
//        Alturas[] vect = new Alturas[input];
//        double heightMedio = 0.0;
//        int count = 0;
//        for (int i = 0; i < input; i++){
//            String name = sc.next();
//            int age = sc.nextInt();
//            double height = sc.nextDouble();
//            vect[i] = new Alturas(name, age, height);
//        }
//
//        for(int j = 0; j < vect.length; j++){
//            heightMedio += vect[j].getHeight();
//            if(vect[j].getAge() < 16){
//                count += 1;
//            }
//        }
//
//        int percet = ((count * 100)/input);
//        System.out.printf("Pessoas com menos de 16 anos: %d \n", percet);
//        System.out.printf("Altura média: %.2f\n",heightMedio/input);
//        for(int z = 0; z < input; z++){
//            if(vect[z].getAge() < 16){
//
//                System.out.println(vect[z].getName());
//
//            }
//        }

//        int input = sc.nextInt();
//        int[] vect = new int[input];
//        for(int i = 0; i < input; i++){
//            vect[i] = sc.nextInt();
//        }
//        System.out.println("Numeros pares:");
//        int count = 0;
//        for(int i = 0; i < vect.length; i++){
//            if(vect[i] % 2 == 0){
//                System.out.printf("%d ",vect[i]);
//                count += 1;
//
//            }
//        }
//        System.out.println("\nQuantidade de pares = " + count);
//        int input = sc.nextInt();
//        Maior[] vect = new Maior[input];
//        double bigger = 0.0;
//        int count = 0;
//        for (int i = 0; i < input; i++){
//            double numberMaior = sc.nextDouble();
//            vect[i] = new Maior(numberMaior);
//        }
//
//        for(int i = 0; i < vect.length; i++){
//            if(vect[i].getNumber() > bigger){
//                bigger = vect[i].getNumber();
//                count+=1;
//            }
//        }
//        System.out.println(bigger);
//        System.out.println(count);
//        int input = sc.nextInt();
//        int[] vetorA = new int[input];
//        int[] vetorB = new int[input];
//        int[] vetorC = new int[input];
//        for(int i = 0; i < input; i++){
//            vetorA[i] = sc.nextInt();
//
//        }
//        for(int i = 0; i < input; i++){
//            vetorB[i] = sc.nextInt();
//        }
//        System.out.println("VETOR RESULTANTE: ");
//        for(int j = 0; j < input; j++){
//            vetorC[j] = vetorA[j] + vetorB[j];
//
//        }
//        for(int j = 0; j < input; j++){
//            System.out.println(vetorC[j]);
//
//        }
//        int input = sc.nextInt();
//        double[] vector = new double[input];
//        double sum = 0.0;
//        for(int i = 0; i < input; i++){
//            vector[i] = sc.nextDouble();
//            sum += vector[i];
//        }
//        double media = sum/input;
//        System.out.println("MEDIA DO VETOR = " + media);
//        for (int i = 0; i < vector.length; i++){
//            if(vector[i] < media){
//                System.out.println(vector[i]);
//            }
//        }
//        int input = sc.nextInt();
//        int[] vector = new int[input];
//        int sum = 0;
//        int count = 0;
//        for(int i = 0; i < input; i++){
//            vector[i] = sc.nextInt();
//        }
//        for(int y = 0; y < input; y++ ){
//            if(vector[y] % 2 == 0){
//                sum+= vector[y];
//                count++;
//            }
//        }
//
//        if(count > 0){
//            double average = (sum/count);
//            System.out.printf("Media dos numeros pares: %.2f", average);
//        }else{
//            System.out.println("NENHUM NUMERO PAR");
//        }

//        int input = sc.nextInt();
//        Older[] vector = new Older[input];
//        int peopleOlder = 0;
//        String namePeopleOld = "";
//        for (int i = 0; i < input; i++){
//            String name = sc.next();
//            int age = sc.nextInt();
//            vector[i] = new Older(name, age);
//        }
//        for(int y = 0; y < vector.length; y++){
//            if(vector[y].getAge() > peopleOlder){
//                peopleOlder = vector[y].getAge();
//                namePeopleOld = vector[y].getName();
//            }
//        }
//        System.out.println(namePeopleOld);

//        int input = sc.nextInt();
//        Approved[] vector = new Approved[input];
//        for(int i = 0; i < input; i++){
//            sc.nextLine();
//            String name = sc.nextLine();
//            double note1 = sc.nextDouble();
//            double note2 = sc.nextDouble();
//            vector[i] = new Approved(name, note1, note2);
//        }
//
//        for(int y = 0; y < vector.length; y++){
//            double media = (vector[y].getNote1() + vector[y].getNote2())/2;
//            if(media >= 6){
//                System.out.println(vector[y].getName());
//            }
//        }
        int input = sc.nextInt();
        PeopleData[] vector = new PeopleData[input];
        double averageWoman = 0.0;
        int countWoman = 0;
        int countMan = 0;
        double lowerHeight = 999;
        double upHeight = 0.0;
        for(int i = 0; i < input; i++){
            char sex = sc.next().charAt(0);
            double height = sc.nextDouble();
            vector[i] = new PeopleData(sex, height);
        }
        for (int y = 0; y < vector.length; y++){
            if(vector[y].getSex() == 'F'){
                averageWoman += vector[y].getHeight();
                countWoman++;
            }else{
                countMan++;
            }
        }

        for(int z = 0; z < vector.length; z++){
            if(vector[z].getHeight() > upHeight){
                upHeight = vector[z].getHeight();

            }else if(vector[z].getHeight() < lowerHeight){
                lowerHeight = vector[z].getHeight();
            }
        }
        System.out.println("Menor altura = "+lowerHeight);
        System.out.println("Maior altura = "+upHeight);
        System.out.println("media das alturas das mulheres = "+averageWoman/countWoman);
        System.out.println("Numeros de homens = "+countMan);

        sc.close();
    }

}
