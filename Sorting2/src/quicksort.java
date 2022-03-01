import java.util.Arrays;

public class quicksort {
    public static void main(String[] args) {
        int[] arr = {-1,2,6,5,4,7,8,9,11,0};
        sorting(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sorting(int[] arr, int low, int hi) {


        if(low >= hi)
            return;
        int s = low;
        int e = hi;
        int piv = s + (e - s)/2;
        while(s <= e){
            while(arr[s]<arr[piv])
                s++;
            while(arr[e]>arr[piv])
                e--;
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        sorting(arr,low,e);
        sorting(arr,s,hi);

    }

}
