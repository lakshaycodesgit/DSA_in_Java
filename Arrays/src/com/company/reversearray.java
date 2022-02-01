package com.company;

import java.util.Arrays;

public class reversearray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int last=arr.length-1;
        for (int i = 0; i < arr.length/2; i++) {
            int temp = 0;
            temp=arr[i];
            arr[i]=arr[last];
            arr[last]=temp;
            last--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
