public class isbinarypowerof2 {
    public static void main(String[] args) {
        int n = 9 ;
        if((n&(n-1)) == 0)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
