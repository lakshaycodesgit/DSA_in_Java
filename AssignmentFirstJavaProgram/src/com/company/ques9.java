package com.company;

import java.util.Scanner;

public class ques9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int flag = 0;
        int sum = 0;
        while(flag==0){
            System.out.println("input number");
            int num = input.nextInt();
            sum += num;
            if(num==0)
                flag++;
        }
        System.out.println("sum of numbers is"+sum);
    }
}
