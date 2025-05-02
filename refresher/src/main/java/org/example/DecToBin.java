package org.example;

import java.util.Scanner;

public class DecToBin {
    public static void main(String[] args){
        System.out.println("Program to convert dec to bin");
        Scanner sc = new Scanner(System.in);
        System.out.println("~Enter an integer : ");
        int inp = sc.nextInt();
        int[] bin = new int[1000];
        int i=0;
        while (inp > 0){
            bin[i] = inp%2 ;
            inp /= 2;
            i++;
        }
        for ( int i1 = i-1; i1 >= 0 ; i1 --){
            System.out.print(bin[i1]);
        }

    }
}
