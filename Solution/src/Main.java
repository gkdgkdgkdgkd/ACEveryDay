import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
    private final static Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        System.out.println(SOLUTION.numWays(5,new int[][]{
                {0,2},
                {2,1},
                {3,4},
                {2,3},
                {1,4},
                {2,0},
                {0,4}
        },3));
        System.out.println(SOLUTION.numWays(3,new int[][]{
                {0,2},
                {2,1}
        },2));
    }

}