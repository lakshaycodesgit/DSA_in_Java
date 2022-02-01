public class findIthbit {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(Integer.toBinaryString(n));

        int i =3;
        int x = 1<<(i-1);
        x=n&x;
        x=x>>(i-1);
        System.out.println(x);
    }
}
