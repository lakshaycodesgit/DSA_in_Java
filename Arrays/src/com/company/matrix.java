package com.company;

import java.util.ArrayList;

public class matrix {
    public static void main(String[] args) {
        long digit = 0;
        int[] num = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;

        for(int i = num.length-1;i>=0;i--){
            digit += num[i]*Math.pow(10,num.length-1-i);
        }
        digit=(long)(digit+k);
        System.out.println(digit);
        int x = (int)(Math.log10(digit))+1;
        System.out.println(x);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i =0;i<x;i++){
            list.add(i);
        }
        for(int i = x-1; i>=0;i--){
            list.set(i,digit%10);
            digit=digit/10;
        }
        System.out.println(list);
    }
}
