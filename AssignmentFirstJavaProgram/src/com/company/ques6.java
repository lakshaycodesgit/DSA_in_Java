package com.company;

import java.util.Scanner;

public class ques6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if(num1 > num2){
            System.out.println("largest number is "+num1);
        }
        else
            System.out.println("largest number is "+num2);
    }
}
