public class pat28 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n*2-1; row++) {
                int totalCol = row > n ? 2*n-row : row;
                int totalSpace = n-totalCol;
                for (int col = 1; col <= totalSpace; col++) {
                    System.out.print(" ");
                }
                for (int col = 1; col <= totalCol; col++) {
                    System.out.print(" *");
                }

                System.out.println();
        }
    }
}
