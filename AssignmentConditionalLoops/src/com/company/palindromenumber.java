package com.company;

import java.util.Scanner;

public class palindromenumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum =0;
        int check = num;
        while(num>0){
            int temp=num;
            temp=temp%10;
            sum= sum + temp;
            sum=sum*10;
            num=num/10;
        }
        System.out.println(sum);
        if(sum/10 ==check)
            System.out.println("palindrome");
        else
            System.out.println("not");
    }
}
