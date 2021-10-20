import utils.Utils;

import java.util.Arrays;
import java.util.List;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        Utils.print(SOLUTION.minMoves(Utils.array(1,2,3)));
        Utils.print(SOLUTION.minMoves(Utils.array(1,1,1)));
        int[] arr = Utils.randomArray(10000,-1_0_000,1_00_00);
        Utils.print(arr);
    }
}