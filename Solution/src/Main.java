import utils.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        int[] arr = Utils.array(1,2);
        Utils.print(SOLUTION.singleNumber(arr));
    }
}