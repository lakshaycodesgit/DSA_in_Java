public class pat32 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = n; row >= 0 ; row--) {
            int ch = 65;
            for (int col = row; col <=n-1; col++) {
                System.out.print((char)(ch+col));
            }
            System.out.println();
        }



    }
}
