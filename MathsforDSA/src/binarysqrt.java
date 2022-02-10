public class binarysqrt {
    public static void main(String[] args) {
        int n = 40;
        int s = 0;
        int e = n;
        int ans = 0;

        double root = 0.0;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (m * m == n) {
                System.out.println(m);
                break;
            }

            if (m * m > n) {
                e = m - 1;
            } else {
                s = m + 1;

            }

        }
        System.out.println(ans);
    }
}
