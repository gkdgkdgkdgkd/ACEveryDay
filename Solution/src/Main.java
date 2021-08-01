import java.util.*;
import java.util.stream.*;

public class Main {
    private final static Solution SOLUTION = new Solution();

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(SOLUTION.kWeakestRows(new int[][]{
                {0, 0},
                {0, 0},
                {1, 1},
                {1, 1}
        }, 1)));
    }
}