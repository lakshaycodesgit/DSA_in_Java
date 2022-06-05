import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class shortestgoodss {
    final static int NO_OF_CHARS = 256;

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int t = parseInt(n);
        while(t>0) {
            String str = sc.nextLine();

            int len = smallest(str);
            if(len>=3) {
                System.out.println(len);
            }
            else
                System.out.println(0);
            t--;
        }
    }
    static int maxdistinct(String str, int n) {
        int count[] = new int[NO_OF_CHARS];
        for (int i = 0; i < n; i++) {
            count[str.charAt(i)]++;
        }

        int max_distinct = 0;
        for (int i = 0; i < NO_OF_CHARS; i++) {
            if (count[i] != 0) {
                max_distinct++;
            }
        }

        return max_distinct;
    }

    static int smallest(String str) {

        int n = str.length();
        int max_distinct = maxdistinct(str, n);
        int minl = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                String subs = null;
                if(i<j)
                    subs = str.substring(i, j);
                else
                    subs = str.substring(j, i);
                int subslength1 = subs.length();
                int sub_distinct_char = maxdistinct(subs, subslength1);
                if (subslength1 < minl && max_distinct == sub_distinct_char) {
                    minl = subslength1;
                }
            }
        }
        return minl;
    }

}
