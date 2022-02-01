package com.company;

import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int sum = 1;
        while(num>0){
            sum=sum*num;
            num-=1;

        }
        System.out.println(sum);
    }
}
