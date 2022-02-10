import java.util.ArrayList;

public class selfdivide {
    public static void main(String[] args) {
        int left =1;
        int right =22;
        ArrayList<Integer> list = new ArrayList<>();
        while (left <= right) {
            if (check(left))
                list.add(left);
            left++;
        }
        System.out.println(list.toString());
    }
    static boolean check(int n){
        if(n==0){
            return false;
        }
        int count = 0;
        int i = 0 ;
        int check = n;
        while(n>0){
            i++;
            int temp = n%10;
            if(temp!=0 && check%temp==0){
                check++;
            }
            n=n/10;
        }
        if(i==count)
            return true;
        return false;
    }
}
