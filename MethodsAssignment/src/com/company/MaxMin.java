package com.company;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1 = in.nextInt();
        System.out.println("Enter num2:");
        int num2 = in.nextInt();
        System.out.println("Enter num3:");
        int num3 = in.nextInt();

        System.out.println("maximum is:" + maximum(num1, num2, num3));
        System.out.println("minimum is:" + minimum(num1, num2, num3));

    }

    static int maximum(int a, int b, int c) {
        int large = b;
        if (a > b) {
            large = a;
        }
        if (c > large)
            large = c;
        return large;
    }

    static int minimum(int a, int b, int c) {
        int small = b;
        if (a < b) {
            small = a;
        }
        if (c < small) {
            small = c;
        }
        return small;
    }
}
