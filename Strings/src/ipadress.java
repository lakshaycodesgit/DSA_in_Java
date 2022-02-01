import java.util.Arrays;

public class ipadress {
    public static void main(String[] args) {
        String address = "65";
//        char[] ch = address.toCharArray();
//        StringBuilder ans = new StringBuilder();
//        for (int i = 0; i < 8; i+=2) {
//            ans.append(address.charAt(i));
//            if(i<=5)
//            ans.append("[.]");
//        }
        char ans = (char)Integer.parseInt(address);
        System.out.println(ans);
    }
}
