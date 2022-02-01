public class pat14 {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1; row <=n ; row++ ){
            for (int col = 1; col <= row-1 ; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2*n-row; col++) {
                if(col==1  || row==1 || col == 2*n-row)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
