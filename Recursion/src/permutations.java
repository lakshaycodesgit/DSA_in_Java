import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {
        String s = "abcd";
        factorialp("",s);
//        System.out.println(factorialpList("",s));
//        System.out.println(factorialcount("",s));
    }

    private static int factorialcount(String p, String up) {
        if(up.isEmpty()) {
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String a = p.substring(0,i);
            String b = p.substring(i,p.length());
            count = count + factorialcount(a+ch+b,up.substring(1));
        }
        return count;
    }

    private static ArrayList<String> factorialpList(String p, String up) {
        if(up.isEmpty()) {
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
           return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String a = p.substring(0,i);
            String b = p.substring(i,p.length());
            ans.addAll(factorialpList(a+ch+b,up.substring(1)));
        }
        return ans;
    }

    private static void factorialp(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String a = p.substring(0,i);
            String b = p.substring(i,p.length());
            factorialp(a+ch+b,up.substring(1));
        }

    }
}
