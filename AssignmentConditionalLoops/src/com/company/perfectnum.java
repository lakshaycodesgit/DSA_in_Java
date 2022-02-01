package com.company;

import java.util.Scanner;

public class perfectnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum=0;
        for (int i = num-1; i >=1; i--)
        {
            if(num%i==0)
                sum=sum+i;
        }

        if(sum==num)
            System.out.println("perfect");
    }
}
