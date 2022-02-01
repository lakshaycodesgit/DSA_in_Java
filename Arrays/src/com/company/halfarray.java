package com.company;
import java.util.Arrays;

public class halfarray {
    public static void main(String[] args) {
        int[] nums = {3,6,9,8,5,2};
        int n = nums.length/2;
        int[] ans = new int[2*n];
        for(int i=0;i<2*n;i++){
            if(i%2==0)
                ans[i]=nums[i/2];
            else
                ans[i]=nums[n+(i-1)/2];
        }
        System.out.println(Arrays.toString(ans));
    }
}
