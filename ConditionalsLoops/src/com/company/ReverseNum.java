package com.company;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum=0;
        while(num>0){
            sum=sum*10+(num%10);
            num=num/10;
        }
        System.out.println(sum);
    }
}
