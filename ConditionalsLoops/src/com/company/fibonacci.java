package com.company;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int sum = 0,a=0,b=1;
        for (int i = 1; i < n; i++) {
            sum=a+b;
            a=b;
            b=sum;
        }
        System.out.println(sum);
    }
}
