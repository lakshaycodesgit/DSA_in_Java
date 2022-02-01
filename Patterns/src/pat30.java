public class pat30 {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= n; row++) {
            for (int col = n-1; col >= row ; col--) {
                System.out.print("  ");
            }
            for (int col = row; col >= 2 ; col--) {
                System.out.print(col+" ");
            }
            for (int col = 1; col <= row ; col++) {
                System.out.print(col+" ");
            }

            System.out.println();
        }
    }
}
