package com.company;

import java.util.Scanner;

public class CountingOccurences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long num = in.nextLong();
        long check = in.nextLong();
        long temp=0,count=0;
        while(num>0){
            temp=num;
            temp=temp%10;
            if(temp==check){
                count++;
            }
            num=num/10;
        }
        System.out.println(count);
    }
}
