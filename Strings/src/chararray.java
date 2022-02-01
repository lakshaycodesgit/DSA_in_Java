import java.util.Arrays;

public class chararray {
    public static void main(String[] args) {
        String word = "abcd";
        String[] patterns =  {"a","abc","bc","d"};
        char[] arr = new char[word.length()];
        arr = word.toCharArray();
        System.out.println(Arrays.toString(arr));
        char[][] arr2 = new char[patterns.length][];
        for(int i = 0; i < patterns.length ; i++){
            arr2[i] = patterns[i].toCharArray();
        }
    }
}
