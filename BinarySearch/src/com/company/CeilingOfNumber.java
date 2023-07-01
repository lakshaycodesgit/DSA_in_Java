package com.company;
import java.util.Arrays;

public class CeilingOfNumber {
    public static void main(String[] args) {
        boolean flag = true;
        System.out.println(flag);
        flag = !flag;
        System.out.println(flag);
        flag = !flag;
        System.out.println(flag);

        int[] arr = {2, 3, 5, 9, 14,14, 16, 18};
        int target = 8;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        int mid=0;
        while (start <= end) {
            mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return arr[mid];
            }
            else if(arr[mid] > target) {
                end = mid - 1;
            }
            else if(arr[mid] < target) {
                start = mid + 1;

            }
        }
        return arr[start];
    }
}