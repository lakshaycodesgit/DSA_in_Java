import java.util.ArrayList;

public class amazondicethrow {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(dice(1,num-1));
    }

    private static ArrayList<Integer> dice(int p, int up) {
        if(up == 0){
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(p);
            return list;
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(dice(p*10+1,up-1));
        list.addAll(dice(p+1,up-1));
        return list;
    }
}
