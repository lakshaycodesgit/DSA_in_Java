public class decrypt {
    public static void main(String[] args) {
//        String s = "10#11#12";
//        String ans = "";
//        String st = "";
//        for(int i = 0 ; i < s.length() ; i++){
//            if(i<s.length()-2 && s.charAt(i+2)!='#'){
//                ans= ""+s.charAt(i);
//                st=st+(char)Integer.parseInt(ans);
//            }
//
//            if(i<s.length()-2 && s.charAt(i+2)=='#'){
//                ans = ""+s.charAt(i)+s.charAt(i+1);
//                st=st+(char)Integer.parseInt(ans);
//                i=i+2;
//            }
//            System.out.println(ans);
//            if(s.charAt(s.length()-1)!='#'){
//                ans= ""+s.charAt(s.length()-1);
//                st=st+(char)Integer.parseInt(ans);
//            }
//            if(s.charAt(s.length()-2)!='#'){
//                ans= ""+s.charAt(s.length()-2);
//                st=st+(char)Integer.parseInt(ans);
//            }
//        }
        String st = "";
        String ans = "10";
        String x = ""+(char)Integer.parseInt(ans);
        st=st+x;
        System.out.println(x);
    }
}
