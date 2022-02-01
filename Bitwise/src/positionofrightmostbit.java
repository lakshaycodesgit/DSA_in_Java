public class positionofrightmostbit {
    public static void main(String[] args) {
        int n=3;
        int pow = 1;
        int count = 1;
        int ans = 0;
        while(n>0){
            pow=n&1;
            if(pow==1){
            ans+= Math.pow(5,count);}

           n=n>>1;
           count++;
        }
        System.out.println(ans);
    }

}
