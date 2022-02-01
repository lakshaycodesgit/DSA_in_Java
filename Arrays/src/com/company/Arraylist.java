package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
        
        list.add(10);
        list.add(20);
        System.out.println(list);
    }
}
