public class resetIthbit {
    public static void main(String[] args) {
        int n = 123456;
        System.out.println(Integer.toBinaryString(n));
        int i =7 ;
        int x = 1<<i-1;
        x=n&(~x);
        System.out.println(Integer.toBinaryString(x));

    }
}
