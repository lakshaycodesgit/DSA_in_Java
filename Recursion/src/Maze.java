import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(count("",3,3));

    }

    private static ArrayList<String> count(String s ,int r, int c) {
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(s);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if(r>1) {
            list.addAll(count(s+"D", r - 1, c));
        }
        if(c>1) {
            list.addAll(count(s+"R", r, c - 1));
        }

        return list;
    }
}
