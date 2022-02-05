public class reversebinary {
    public static void main(String[] args) {
        int n= 1;
        int res= 0;
        for (int i = 0; i <32; i++) {
            int t = n&1;
            res = t|res;
            res=res<<1;
            n=n>>1;
        }
        System.out.println(res);
    }
}
