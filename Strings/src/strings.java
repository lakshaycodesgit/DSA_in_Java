import java.util.Arrays;

public class strings {
    public static void main(String[] args) {
        String a = "laki";
        String b = a;
        System.out.println(a);
        System.out.println(b);

        a = "lakiyo";
        System.out.println(a);
        System.out.println(b);

        int[] arr = {1, 2, 3};
        int[] nums = arr;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(nums));
        arr[1] = 3;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(nums));
    }
}
