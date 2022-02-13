public class countzeroes {
    static int count = 0;
    public static void main(String[] args) {
        int n = 17834384;
        int ans = zero(n,count);
        System.out.println(ans);
    }
    static int zero(int n ,int count){
        if(n==0)
            return count;
        if(n%10 == 0)
            count++;
        return zero(n/10,count);
    }
}
