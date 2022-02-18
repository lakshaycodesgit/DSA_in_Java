public class sortedarr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,9,8};
        boolean ans = sort(arr,0);
        System.out.println(ans);
        ans=sort2(arr,0);
        System.out.println(ans);
    }
    static boolean sort(int[] arr , int i){
        if(i==arr.length-1)
            return true;
        if(arr[i]>arr[i+1])
            return false;
        return sort(arr,++i);
    }
    static boolean sort2(int[] arr,int i){
        if(i==arr.length-1)
            return true;
        return (arr[i]<arr[i+1]) && sort2(arr,++i);
    }
}
