import utils.Utils;

import java.util.Arrays;

public class Main {
    private static final Solution SOLUTION = new Solution();
    public static void main(String[] args) {
        int[] arr = Utils.array(1,4,7,8,10,13,16,19,20,32,35,38);
        Utils.print("arr is ");
        Utils.print(arr);
        Utils.print(SOLUTION.smallestDistancePair(arr,5));
    }
}
