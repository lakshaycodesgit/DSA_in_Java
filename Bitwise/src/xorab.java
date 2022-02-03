public class xorab {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
       int ans = sol(a-1)^sol(b);
        System.out.println(ans);
    }

    private static int sol(int a) {
        if(a%4==0)
            return a;
        if(a%4==1)
            return 1;
        if(a%4==2)
            return a+1;
        return 0;
    }
}
