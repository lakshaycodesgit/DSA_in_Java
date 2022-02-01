package com.company;

public class binarysearch {

    public static void main(String[] args) {
        int[] arr={4,4,4,4,4,4,4,4,4,5,6};
        int target=4;
        int ans=search(arr,target);
        System.out.println(ans);
    }
    static int search(int[] arr,int target){
        int start = 0;
        int end= arr.length-1;

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
