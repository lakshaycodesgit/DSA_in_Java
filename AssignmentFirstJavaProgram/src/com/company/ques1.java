package com.company;

import java.util.Scanner;

public class ques1 {

    public static void main(String[] args) {
        System.out.println("Input the number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int result = 1;
        while(num>1){
            result = result * num;
            num--;
        }
        System.out.println(result);
    }
}
