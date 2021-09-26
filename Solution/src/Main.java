import utils.Utils;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        for (int i = 0; i < 10_000; i++) {
            int x = Utils.randomInt(-1000, 1000);
            int y = Utils.randomInt(-1000, 1000);
            if (x + y != SOLUTION.getSum(x, y)) {
                if (x < 0) {
                    Utils.print(Integer.toBinaryString(x));
                }
                if (y < 0) {
                    Utils.print(Integer.toBinaryString(y));
                }
                Utils.print("x is " + x);
                Utils.print("y is " + y);
                Utils.print("x+y is " + (x + y) + " solution result is " + SOLUTION.getSum(x, y));
                break;
            }
        }
    }
}