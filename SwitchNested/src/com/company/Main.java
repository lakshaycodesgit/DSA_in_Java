package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "mango" -> System.out.println("tasty");
            case "apple" -> System.out.println("red");
            case "grape" -> System.out.println("black");
            default -> System.out.println("hehe");
        }
    }
}
