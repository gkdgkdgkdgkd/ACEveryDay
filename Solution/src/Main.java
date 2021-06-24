import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
    private final static Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        System.out.println(SOLUTION.maxPoints(new int[][]{
                {1,1},
                {3,2},
                {5,3},
                {4,1},
                {2,3},
                {1,4},
        }));
        System.out.println(SOLUTION.maxPoints(new int[][]{
                {1,1},
                {2,2},
                {3,3}
        }));
    }

}