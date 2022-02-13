public class revnum {
    public static void main(String[] args) {
        int sum = 0;
        int n = 12321;
        int ans = rev(n,sum);
        System.out.println(ans);
        ans=rev2(n);
        System.out.println(ans);
        System.out.println(palindrome(n));
    }
    static int rev(int n,int sum){
        sum = sum*10 + (n%10);
        if(n%10==n)
            return sum;

        return rev(n/10,sum);
    }
    static int rev2(int n){
        int digits = (int)(Math.log10(n))+1;
        return helper(n,digits);
    }
    static int helper(int n,int digits){
        if(n%10==n)
            return n;
        return (n%10)*(int)Math.pow(10,digits-1) + helper(n/10,--digits);
    }
    static boolean palindrome(int n){
        return (n==rev2(n));
    }

}
