public class StringRecursion {
    static StringBuilder str = new StringBuilder();
    public static void main(String[] args) {
        String s = "baccad";
        System.out.println(removea(s,0));
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
}
