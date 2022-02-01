public class pat12 {
    public static void main(String[] args) {
        int n = 10;

            for (int row = 1; row <= n; row++) {
                if(row<=n/2) {
                    for (int col = 1; col <= row - 1; col++) {
                        System.out.print(" ");
                    }
                    for (int col = 1; col <= (n/2 - row + 1); col++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                if(row>n/2){
                        for (int col = 1; col <= (n-row); col++) {
                            System.out.print(" ");
                        }
                        for (int col = 1; col <=row-n/2; col++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                }
        }
    }
}
