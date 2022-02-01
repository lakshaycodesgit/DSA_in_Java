package com.company;

import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        System.out.println("enter the operator");
        Scanner input = new Scanner(System.in);
        char operator = input.next().charAt(0);
        System.out.println("enter 2 no.s");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if(operator == '+'){
            System.out.println(num1+num2);
        }
        if(operator == '-'){
            System.out.println(num1-num2);
        }
        if(operator == '*'){
            System.out.println(num1*num2);
        }
        if(operator == '/'){
            System.out.println(num1/num2);
        }

    }
}
