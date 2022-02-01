public class rightmostbit {
    public static void main(String[] args) {
        int n = 123456;
        int count = 1;
        while(n>0) {
            if ((n & 1) == 1) {
                System.out.println(count);
                n = 0;
            }
            else {
                count++;
                n = n >> 1;
            }
        }
    }
}
