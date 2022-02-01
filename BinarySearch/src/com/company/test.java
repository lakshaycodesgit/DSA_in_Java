package com.company;


import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr = {2,6,3,4,7,2,10,3,2,1};
        int k = 5;
        int n = arr.length;
        Arrays.sort(arr);

        

        int start = 0;
        int end = n-1;
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[end]-arr[start]);
    }

    }

