package com.company;
import java.lang.Math;
public class infinitearray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int target = 19;
        int start = 0;
        int n = 0;
        int k = (int) Math.pow(2,n);
        int end = 1*k;
        while(target>arr[end]){
            n++;
            start = end + 1;
            end = end+k;
        }
        System.out.println(search(arr,target,start,end));


    }
    static int search(int[] arr,int target,int start,int end){
        while (start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid]>target) {
                end = mid - 1;
            }else if(target>arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
