import utils.Utils;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        int[] arr = Utils.randomArray(100_000,1,10_000);
        int difference = Utils.randomInt(1,10);
        Utils.print(arr);
        Utils.print(difference);
        Utils.print(SOLUTION.longestSubsequence(arr,difference));
    }
}