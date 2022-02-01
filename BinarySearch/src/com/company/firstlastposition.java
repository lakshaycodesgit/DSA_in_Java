package com.company;

import java.util.Arrays;

public class firstlastposition {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,6,6,6,6,6,7,8,9};
        int target = 6;
        int[] ans = {-1,-1};
        ans[0]= search(nums,target,true);
        ans[1]= search(nums,target,false);
        System.out.println(Arrays.toString(ans));
    }
    static int search(int[] arr,int target,boolean firstorlast){
        int start = 0;
        int ans = -1;
        int mid = 0;
        int end = arr.length-1;
        while(start<=end){
            mid = start + (end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end = mid-1;
            }
            else{
                ans=mid;
                if(firstorlast){
                    end = mid-1;
                }
                else
                    start=mid+1;
            }

        }

        return ans;

    }
}
