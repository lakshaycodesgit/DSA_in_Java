import java.util.ArrayList;

public class linearsearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,7,8,9};
        int target = 7;
        int ans = search(arr,target,0);
//        System.out.println(ans);
//        System.out.println(search2(arr,target,0));
        ArrayList<Integer> list = new ArrayList<Integer>();

//        System.out.println(search3(arr,target,0,list));
        System.out.println(search4(arr,target,0));


    }
    static int search(int[] arr,int target,int i){
        if(arr[i]==target)
            return i;
        if(i==arr.length-1)
            return -1;
        return search(arr,target,++i);
    }
    static boolean search2(int[] arr,int target , int i){
        if(i==arr.length)
            return false;
        return (arr[i]==target) || search2(arr,target,++i);
    }
    static ArrayList<Integer> search3(int[] arr,int target , int i, ArrayList<Integer> list2){
        if(i==arr.length-1){
            return list2;
        }
        if(target==arr[i]){
            list2.add(i);
        }
        return search3(arr,target,++i,list2);
    }
    static ArrayList<Integer> search4(int[] arr,int target , int i){
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(i==arr.length-1){
            return list;
        }
        if(target==arr[i]){
            list.add(i);
        }
        ArrayList<Integer> list2 = search4(arr,target,++i);
        list.addAll(list2);
        return list;
    }

}
