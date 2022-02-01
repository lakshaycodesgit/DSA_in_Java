package com.company;

import java.util.Arrays;

public class twosum {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,4,9,56,90};
        int target = 8;
        int[] arr = {0,0};
        for(int i = 0; i<numbers.length;i++){
            arr[0]=i;
            int res = target - numbers[i];
            int ans = binary(numbers,res);
            if(res==numbers[ans]){
                arr[1]=ans;
                break;
            }
        }
        arr[0]++;
        arr[1]++;
        System.out.println(Arrays.toString(arr));;
    }

    static int binary(int[] arr , int target){
        int give=0;
        int start = 0;
        int end= arr.length-1;

        while (start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid]>target) {
                end = mid - 1;
            }else if(target>arr[mid]) {
                start = mid + 1;
            } else {
                give = mid;
                break;
            }
        }
        for(int i = give ; i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                give++;
            }
        }
        return give;
    }
}
