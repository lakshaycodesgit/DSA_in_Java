package com.company;

import java.util.Scanner;

public class ques7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        int rem = num-1;
        while(rem>1){
            if(num%rem==0)
                System.out.println(rem);
            rem--;
        }
    }
}
