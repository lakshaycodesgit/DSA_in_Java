import java.util.LinkedHashMap;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class sus {
    static void longestSubstring(String inputString) {
        char[] arr1 = inputString.toCharArray();
        String long_str = null;
        int str_length = 0;
        LinkedHashMap < Character, Integer >
                charPosMap = new LinkedHashMap < Character, Integer >();
        for (int i = 0; i < arr1.length; i++) {
            char ch = arr1[i];
            if (!charPosMap.containsKey(ch)) {
                charPosMap.put(ch, i);
            } else {
                i = charPosMap.get(ch);
                charPosMap.clear();
            }
            if (charPosMap.size() > str_length) {
                str_length = charPosMap.size();
                long_str = charPosMap.keySet().toString();
            }
        }
//        if (str_length>=3) {
//            System.out.println(str_length);
//        }
//        else
//            System.out.println(0);
        System.out.println(str_length);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int t = parseInt(n);
        while(t>0) {
            String s = sc.nextLine();
            longestSubstring(s);
            t--;
        }
    }
}
