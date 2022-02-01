package com.company;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int check = num;
        int sum=0;
        while(num>0){
            int temp = num;
            temp = temp % 10;
            sum = sum + (temp*temp*temp);
            num=num/10;
        }

        if(sum==check)
            System.out.println("armstrong num");
        else
            System.out.println("not");
    }
}
