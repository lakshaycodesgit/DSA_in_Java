package com.company;

import java.util.Scanner;

public class largestofthree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int large = a;

        if (b > a) {
            large = b;
        }
        if (c > large) {
            large = c;
        }
        System.out.println(large);
    }
}
 