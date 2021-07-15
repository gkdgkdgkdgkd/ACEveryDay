import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
    private final static Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        System.out.println(SOLUTION.maximumElementAfterDecrementingAndRearranging(new int[]{2,2,1,2,1}));
        System.out.println(SOLUTION.maximumElementAfterDecrementingAndRearranging(new int[]{100,1,1000}));
        System.out.println(SOLUTION.maximumElementAfterDecrementingAndRearranging(new int[]{1,2,3,4,5}));
        System.out.println(SOLUTION.maximumElementAfterDecrementingAndRearranging(new int[]{279268,756590,840776,239875,619870,991189,107193,945216}));
    }

}