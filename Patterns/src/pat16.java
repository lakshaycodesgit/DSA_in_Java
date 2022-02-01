public class pat16 {
    public static void main(String[] args) {
        int n =5;
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <= n-row ; col++) {
                System.out.print(" ");
            }
            String s = String.valueOf((int)Math.pow(11,row-1));
            System.out.print(s.replace(""," "));
            System.out.println();
        }
    }
}
