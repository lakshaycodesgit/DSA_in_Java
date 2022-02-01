package com.company;

import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter principal , rate and time");
        int principal = input.nextInt();
        float rate = input.nextFloat();
        int time = input.nextInt();
        float result =  principal * rate * time / 100;
        System.out.println("The SI is "+result);
    }
}
