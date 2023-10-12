package com.company.beecrowd;

import com.company.Randomcode.Old;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bee1173 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Old> numberBigger = new ArrayList<>();
        List<Integer> newNumberBigger = new ArrayList<>();
        int input = sc.nextInt();
        for(int i = 0; i < input; i++){
            int number = sc.nextInt();
            Old numberBig = new Old(number);
            numberBigger.add(numberBig);
        }
        for(Old num : numberBigger){
            newNumberBigger.add(num.getNumberBigger());
            if(num.getNumberBigger() == 1){
                newNumberBigger.add(0, 1);
            }
        }
        for(Integer num : newNumberBigger){
            System.out.println(num);
        }

        sc.close();


    }

}
