public class pat13 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++){
            //Print trailing spaces
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            //Print hollow pyramid
            for(int j=1;j<=(2*i-1);j++){
                if( i==n||j==1||j==(2*i-1)){
                    System.out.print("*");
                }
			else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
