public class complementnum {
    public static void main(String[] args) {
        int num = 10;
        int i=0;
        int j=0;

        while(i<num){
            i+=Math.pow(2,j);
            j++;
        }
        System.out.println(i-num);
    }
}
