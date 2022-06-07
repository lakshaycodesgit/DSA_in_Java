import java.util.ArrayList;

public class digitsofphonenum {
    public static void main(String[] args) {
        String s = "56";
        System.out.println((digits("",s)));
    }

    private static ArrayList<String> digits(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int dig = up.charAt(0)-'0';
        int x = (dig-1)*3;
        if(dig>=7 && dig<=9){
            x=x+1;
        }
        int y = (dig-2)*3;
        if(dig == 8){
            y=y+1;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = y; i < x; i++) {
            char ch = (char)('a'+i);
            list.addAll(digits(p+ch,up.substring(1)));
        }
        return list;
    }
}
