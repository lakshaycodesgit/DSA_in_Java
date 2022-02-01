package com.company;

import java.util.Arrays;

public class stringSearch {
    public static void main(String[] args) {
        String name ="lakshay";
        char target = 'k';
        boolean ans = search(name,target);
        System.out.println(ans);
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean search(String str,char target){
        if(str.length()==0)
            return false;
        for(char i : str.toCharArray()) {
            if (i == target)
                return true;
        }
        return false;
    }
}
