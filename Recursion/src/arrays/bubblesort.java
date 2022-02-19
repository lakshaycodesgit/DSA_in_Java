package arrays;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {2,6,5,4,1,3,9,11,-1,0};
        System.out.println(Arrays.toString(sort(arr,arr.length)));
    }
    static int[] sort(int[] arr,int i){
        if(i==0){
            return arr;
        }
        int j = 0;
        while(j<=i) {
            if (j < arr.length-1 && arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
            j++;
        }
        return sort(arr,--i);
    }

}
