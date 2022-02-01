public class setithbit {
    public static void main(String[] args) {
        int n = 123456;
        System.out.println(Integer.toBinaryString(n));
        int i =6 ;
        int x = 1<<i-1;
        x=x | n;
        System.out.println(Integer.toBinaryString(x));
    }
}
