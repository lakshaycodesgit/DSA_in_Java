package com.company;

import java.util.Scanner;

public class primecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = in.nextInt();
        System.out.println(prime(num));
    }
    static boolean prime(int num){
        int c=2;
        if(num <=1){
            return true;
        }
        while(c*c<=num){
            if(num%c==0)
                return false;
            c++;
        }

        return true;
    }
}
