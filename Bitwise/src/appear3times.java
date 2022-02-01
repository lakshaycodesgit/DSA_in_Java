public class appear3times {
    public static void main(String[] args) {
        int[] arr = {2,2,3,2,7,7,8,7,8,8};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count = count + Integer.parseInt(Integer.toBinaryString(arr[i]));
        }
        int ten = 1;
        int ans = 0;
        while(count>0){
            int t = count%10;
            t=t%3;
            ans=ans+t*ten;
            ten=ten*10;
            count=count/10;
        }
        String s = ""+ans;
        System.out.println(Integer.parseInt(s,2));
    }
}
