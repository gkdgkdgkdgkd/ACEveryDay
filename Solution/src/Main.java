import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
    private final static Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        System.out.println(SOLUTION.slidingPuzzle(new int[][]{
                {4,1,2},
                {5,0,3}
        }));
        System.out.println(SOLUTION.slidingPuzzle(new int[][]{
                {3,2,4},
                {1,5,0}
        }));
        System.out.println(SOLUTION.slidingPuzzle(new int[][]{
                {1,2,3},
                {4,5,0}
        }));
        System.out.println(SOLUTION.slidingPuzzle(new int[][]{
                {1,2,3},
                {4,0,5}
        }));
        System.out.println(SOLUTION.slidingPuzzle(new int[][]{
                {1,2,3},
                {5,4,0}
        }));
    }

}