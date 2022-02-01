package com.company;
public class characterarray {
    public static void main(String[] args) {
        char[] arr = {'a','c','c','c','f','j'};
        char target = 'c';
        System.out.println(chararray(arr,target));
    }
    static char chararray(char[] letters,char target){
        int start = 0;
        int end = letters.length - 1;

        while(start<=end){

            int mid = start + (end-start)/2;

            if(target > letters[mid]){
                start = mid + 1;
            }
            else
                end = mid -1;

        }
        return letters[start];
    }
}
