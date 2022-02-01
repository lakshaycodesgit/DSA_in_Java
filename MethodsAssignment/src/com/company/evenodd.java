package com.company;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1 = in.nextInt();
        System.out.println("the num is "+ evenodd(num1));
    }
    static String evenodd(int a){
        if(a%2 == 0)
            return "even";
        else
            return "odd";
    }
}
