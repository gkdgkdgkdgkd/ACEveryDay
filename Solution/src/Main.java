import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
    private final static Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        System.out.println(SOLUTION.minPairSum(new int[]{3,5,2,3}));
        System.out.println(SOLUTION.minPairSum(new int[]{3,5,4,2,4,6}));
    }
}