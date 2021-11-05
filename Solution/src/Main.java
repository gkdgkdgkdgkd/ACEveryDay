import utils.Utils;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        int len = 500;
        int[] arr = Utils.randomArray(len, -100_000, 100_000);
        int[] l = Utils.randomArray(len,0, len - 3);
        int[] r = new int[len];
        for (int i = 0; i < len; i++) {
            r[i] = Utils.randomInt(l[i] + 1, len - 1);
        }
        Utils.print(arr);
        Utils.print(l);
        Utils.print(r);
        Utils.print(SOLUTION.checkArithmeticSubarrays(arr, l, r));
//        Utils.print(difference);
//        Utils.print(SOLUTION.longestArithSeqLength(Utils.array(0, 5, 8, 9, 10,11)));
    }
}