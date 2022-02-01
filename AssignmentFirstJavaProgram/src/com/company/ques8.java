package com.company;

import java.util.Scanner;

public class ques8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter amount in rupees");
        float inr = input.nextFloat();
        float usd = inr*74.4f;
        System.out.println(usd);
    }
}
