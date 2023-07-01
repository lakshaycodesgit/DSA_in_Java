public class mazeobst {
    public static void main(String[] args) {
        System.out.println(count(5,5));
    }
    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left=0,right=0;
        if(r!=2 || c!=2) {
            left = count(r - 1, c);
            right = count(r, c - 1);
        }
        return left + right;
    }
}
