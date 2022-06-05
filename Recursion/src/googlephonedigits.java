import java.util.ArrayList;
import java.util.List;

public class googlephonedigits {
    public static void main(String[] args) {
        String digits = "";
        int num = Integer.parseInt(digits);
        num = num-11;
        String num2 = num+"";
        System.out.println(message("",num2));
    }

    private static ArrayList<String> message(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0)-'0';
        ArrayList<String> ans = new ArrayList<>();
        for (int i = (digit-1)*3; i < digit*3 ; i++) {
            char ch = (char)('a'+i);
            ans.addAll(message(p+ch , up.substring(1)));
        }
        return ans;
    }
}
