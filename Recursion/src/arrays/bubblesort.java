package arrays;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {2,6,5,4,1,3,9,11,-1,0};
        System.out.println(Arrays.toString(sort(arr,arr.length,0)));
    }
    static int[] sort(int[] arr,int i,int j){
        if(i==0){
            return arr;
        }
        if(j<i) {
            if (j< arr.length-1 && arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
            return sort(arr,i,++j);
        }
        else
          return sort(arr,--i,0);
    }

}
