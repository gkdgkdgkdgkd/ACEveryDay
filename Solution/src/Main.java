import utils.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        int[] arr = Utils.randomArray(10_000,-100_000,100_000);
        Utils.print(arr);
        Utils.print(SOLUTION.distributeCandies(arr));
    }
}