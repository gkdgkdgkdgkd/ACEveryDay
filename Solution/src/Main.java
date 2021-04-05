import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] a = {1,2,3,0,0,0};
        int [] b = {2,5,6};
        new Solution().merge(a,3,b,3);
        System.out.println(Arrays.toString(a));
    }
}
