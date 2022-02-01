package com.company;

import java.util.Scanner;

public class ques10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int flag = 0;
        int large=0;
        int check = 0;
        while(flag==0){
            System.out.println("input number");
            int num = input.nextInt();
            if(num>check) {
                large = num;
            }
            else
                check=num;
            if(num==0)
                flag++;
        }
        System.out.println("largest of numbers is"+large);
    }

}
