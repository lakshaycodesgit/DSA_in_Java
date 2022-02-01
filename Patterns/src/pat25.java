public class pat25 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n-1 ; col++) {
                if(col==1 || col == n-1 || row ==1 || row == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
