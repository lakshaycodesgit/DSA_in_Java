import java.util.Arrays;


public class selectionsort {
    public static void main(String[] args) {
        int[] arr = {-1,2,6,5,4,7,8,9,11,0};
        System.out.println(Arrays.toString(sort2(arr,arr.length-1,0, 0
        )));
    }

    static int[] sort2(int[] arr, int i, int j,int max) {
        if(i==0)
            return arr;
        if(j<i){
            if(arr[j]>arr[max]) {
                max = j;
            }
            return sort2(arr,i,++j,max);
        }
        else{
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
            return sort2(arr,--i,0,i);
        }
    }
}
