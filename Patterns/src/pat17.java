public class pat17 {
    public static void main(String[] args) {
        int n = 4;

        for (int row = 1; row <= n*2-1; row++) {
            if (row <= n) {
                for (int col = n - 1; col >= row; col--) {
                    System.out.print("  ");
                }
                for (int col = row; col >= 2; col--) {
                    System.out.print(col + " ");
                }
                for (int col = 1; col <= row; col++) {
                    System.out.print(col + " ");
                }

                System.out.println();
            }
            if(row>n){
                for (int col = 1; col <=row-n; col++) {
                    System.out.print("  ");
                }
                for (int col = 2*n-row; col >= 1; col--) {
                    System.out.print(col + " ");
                }
                for (int col = 2; col <= 2*n-row; col++) {
                    System.out.print(col + " ");
                }

                System.out.println();
            }
        }
    }
}
