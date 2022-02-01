public class pat15 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= 2*n-1; row++) {
            if(row<=n){
                for (int col = 1; col <= (n-row); col++) {
                    System.out.print(" ");
                }
                for (int col = 1 ; col <=2*row-1; col++) {
                    if(col==1 || col == 2*row-1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
            if(row>n){
                for (int col = 0; col < row-n; col++) {
                    System.out.print(" ");
                }
                for (int col = 1; col <= 2*(2*n-row)-1; col++) {
                    if(col==1||col==2*(2*n-row)-1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
