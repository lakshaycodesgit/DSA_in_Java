public class printnto1 {
    public static void main(String[] args) {
        int n = 5;
        print(n);
        System.out.println();
        printrev(n);
    }
    static void printrev(int n){

        if(n==0)
            return;
        printrev(n-1);
        System.out.print(n+" ");
    }
    static void print(int n){
        System.out.print(n+" ");
        if(n==1)
            return;
        print(n-1);

    }
}
