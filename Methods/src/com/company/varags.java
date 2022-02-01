package com.company;

public class varags {
    public static void main(String[] args){
         fun(2,3,5,6,7,8,9);
    }
    static void fun(int a,int b,int ...v){
        System.out.println(a+b);
    }
}
