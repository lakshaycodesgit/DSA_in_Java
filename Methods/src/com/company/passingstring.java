package com.company;

import java.util.Scanner;

public class passingstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        String personalised = myGreet(name);
        System.out.println(personalised);
    }

    static String myGreet(String name) {
        String msg = "hello "+name;
        return msg;
    }
}
