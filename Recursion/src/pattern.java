public class pattern {
    public static void main(String[] args) {
//        star(4,0);
        System.out.println();
        star2(4,0);
    }
    static void star(int row , int col){
        if(row==0)
            return;

        if(col<row){
            System.out.print("*");
            star(row,++col);
        }
        else {
            System.out.println();
            star(--row, 0);
        }
    }
    static void star2(int row , int col){
        if(row==0)
            return;

        if(col<row){
            star2(row,++col);
            System.out.print("*");
        }
        else {
            star2(--row, 0);
            System.out.println();
        }
    }
}
