public class StringRecursion {
    static StringBuilder str = new StringBuilder();
    static int nn = 0;
    public static void main(String[] args) {
        String s = "baccad";
        String s2 = "baccad";
        System.out.println(removea(s,0));
        System.out.println(remove(s2));
    }
    static String removea(String s,int n){
        if(n==s.length()){
            return str.toString();
        }
        if(s.charAt(n) != 'a'){
            str.append(s.charAt(n));
        }
        return removea(s,++n);
    }
    static String remove(String s){

        if(nn==s.length()){
            return "";
        }
        if(s.charAt(nn) != 'a') {

            return s.charAt(nn++) + remove(s);
        }
        ++nn;
        return "" + remove(s);
    }
}
