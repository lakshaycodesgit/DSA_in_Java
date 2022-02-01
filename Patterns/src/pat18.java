//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *
//        *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********

public class pat18 {
    public static void main(String[] args) {
        int n =5;
        for (int row = 1; row <= 2*n; row++) {
            if(row<=n){
                for (int col = 1; col <= n-row+1; col++) {
                    System.out.print("*");
                }
                for (int col = 1; col <=2*row-2; col++) {
                    System.out.print(" ");
                }
                for (int col = 1; col <= n-row+1; col++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            if(row>n){
                for (int col = 1; col <= row-n; col++) {
                    System.out.print("*");
                }
                for (int col = 1; col <= 2*(2*n-row) ; col++) {
                    System.out.print(" ");
                }
                for (int col = 1; col <= row-n; col++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
