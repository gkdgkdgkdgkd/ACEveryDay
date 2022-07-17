import utils.Utils;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        Utils.print(Utils.randomArrayNoRepeated(10_000,0,9999));
    }
}