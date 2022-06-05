import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class mink {
    static ArrayList<Long> list1 = new ArrayList<>();
    static ArrayList<Long> list2 = new ArrayList<>();
    static ArrayList<Long> list3 = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String f = sc.nextLine();
        int t = parseInt(f);
        while(t>0) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = n + m - k;
            op(k, n, m, a, b, x);
            System.out.println(Collections.min(list3));
            list1.clear();
            list2.clear();
            list3.clear();
            t--;
        }
    }
    static void op(long k,long n,long m,long a,long b,long x){
        for (long i = a; i <= n; i++) {
            list1.add(i);
        }
        for (long j = b; j <= m; j++) {
            list2.add(j);
        }
        for (long p = 0; p < list1.size(); p++) {
            for (long q = 0; q < list2.size(); q++) {
                if(list1.get(p)+list2.get(q) == x)
                    list3.add(list1.get(p)*list2.get(q));
            }

        }
    }
}
