package com.company;

import java.util.Scanner;

public class sum {

    public static void main(String[] args) {
	int ans = sum();
        System.out.println(ans);
    }
    static int sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("num 1 enter");
        int num1 = in.nextInt();
        System.out.println("num 2 enter");
        int num2 = in.nextInt();
        return num1+num2;
    }
}
