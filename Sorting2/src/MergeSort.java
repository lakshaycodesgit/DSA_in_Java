import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {-1,2,6,5,4,7,8,9,11,0};
        System.out.println(Arrays.toString(sort(arr)));
        sortinplace(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));

    }

    private static void sortinplace(int[] arr,int s , int e) {
        if(e-s==1)
            return;
        int mid = (e + s)/2;
        sortinplace(arr,s,mid);
        sortinplace(arr,mid,e);
        mergeplace(arr,s,mid,e);
    }
    private static void mergeplace(int[] arr , int s, int m , int e){
        int[] mix = new int[e-s];
        int i = s;
        int j = m;
        int k = 0;
        while(i<m && j<e){
            if(arr[i]>arr[j]) {
                mix[k] = arr[j];
                j++;
            }
            else {
                mix[k] = arr[i];
                i++;
            }
            k++;
        }
        while(i<m){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }

        for(i = 0 ; i < mix.length ; i++){
            arr[s+i]=mix[i];
        }

    }

    private static int[] sort(int[] arr) {
        if(arr.length==1)
            return arr;
        int mid = arr.length/2;
        int[] left = sort(Arrays.copyOfRange(arr,0,mid));
        int[] right = sort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length+second.length];
        int i=0,j=0,k=0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]) {
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
}
