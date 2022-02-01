package com.company;

public class sqrtLC {
    public static void main(String[] args) {
        int x = 8;
        int start = 1;
        int end = x;
        int mid = 0;
        while(start<=end){
            mid = start + (end-start)/2;
            if(mid*mid < x){
                start=mid+1;
            }
            else if(mid*mid == x){
                break;
            }
            else if(mid*mid > x){
                end=mid-1;
            }
        }

        System.out.println(mid);
    }
}
