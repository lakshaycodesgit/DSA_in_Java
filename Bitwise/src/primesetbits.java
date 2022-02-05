public class primesetbits {
    public static void main(String[] args) {
        int left = 6;
        int right = 11;
        int count = 0;
        while(left<=right){
            if(isPrime(left))
                count++;
            left++;
        }
        System.out.println(count);;
    }
    static boolean isPrime(int n){
        int check=0;
        while(n>0){
            check++;
            n=(n&(n-1));
        }
        boolean flag = true ;
        for(int i = 2; i < check ; i++){
            int rem = check % i;
            if(rem==0){
                flag=false;
            }
        }
        return flag;
    }
}
