import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    private final static Solution SOLUTION = new Solution();

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(SOLUTION.restoreArray(new int[][]{
                {4,-2},
                {1,4},
                {-3,1}
        })));
    }
}