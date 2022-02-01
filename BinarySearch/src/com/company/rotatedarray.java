package com.company;

public class rotatedarray {
    public static void main(String[] args) {
        int[] nums = {1};
        int target=0;
        int start = 0;
        int end = nums.length-1;
        int mid = 0;
        boolean flag = true;
        while(flag){
            mid = start + (end-start)/2;
            if(nums[mid+1]<nums[mid])
                flag=false;
            else if(nums[mid]>nums[end])
                start=mid+1;
            else if(nums[end]>nums[mid])
                end = mid-1;

        }
        System.out.println(mid);
        int peak = mid;

        start=0;
        end=peak;
        while (start <= end){
            mid = start + (end-start)/2;

            if(nums[mid]>target) {
                end = mid - 1;
            }else if(target>nums[mid]) {
                start = mid + 1;
            } else {
                System.out.println(mid);
                start++;
            }
        }

        start=peak+1;
        end=nums.length-1;
        while (start <= end){
            mid = start + (end-start)/2;

            if(nums[mid]>target) {
                end = mid - 1;
            }else if(target>nums[mid]) {
                start = mid + 1;
            } else {
                System.out.println(mid);
                start++;
            }
        }
        System.out.println(-1);
    }
}
