import java.util.Scanner;

public class test3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        boolean bool = true;
        while(bool){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i < n ; i++){
                arr[i]=sc.nextInt();
            }
            for(int j = n-1 ; j >= 0 ; j--){
                System.out.print(arr[j]+" ");
            }
            T--;
            if(T==0){
                bool = false;
            }
        }
    }
}
