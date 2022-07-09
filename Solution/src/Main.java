import utils.Utils;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        Utils.print(SOLUTION.lenLongestFibSubseq(Utils.array(1,3,7,11,12,14,18)));
        Utils.print(SOLUTION.lenLongestFibSubseq(Utils.array(1,2,3,4,5,6,7,8)));
    }
}