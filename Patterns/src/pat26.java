public class pat26 {
    public static void main(String[] args) {
        int n = 6;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col < n-row+2; col++) {
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
}
