package com.company;

public class orderagnosticBS {
    public static void main(String[] args) {
//        int[] arr = {95,85,74,42,23,15,3};
        int[] arr = {2,6,8,15,48,59,86,95};
        int target = 95;
        int ans=search2(arr,target);
        System.out.println(ans);
    }
    static int search2(int[] arr,int target){
        int start=0;
        int end=arr.length -1;
        boolean asc = arr[start]<arr[end];

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid]==target){
                return mid;
            }

            if(asc){
                if(target>arr[mid])
                    start = mid +1;
                else
                    end=mid-1;
            }
            else{
                if(target<arr[mid])
                    start=mid+1;
                else
                    end=mid-1;
            }
        }
        return -1;

    }
}
