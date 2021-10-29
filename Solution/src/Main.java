import utils.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
//        Utils.print(SOLUTION.isSelfCrossing(Utils.array(2,1,1,2)));
//        Utils.print(SOLUTION.isSelfCrossing(Utils.array(1,2,3,4)));
//        Utils.print(SOLUTION.isSelfCrossing(Utils.array(1,1,1,1)));
        int[] arr = Utils.randomArray(100_000,1,100_000);
        Utils.print(arr);
        Utils.print(SOLUTION.isSelfCrossing(arr));
    }
}