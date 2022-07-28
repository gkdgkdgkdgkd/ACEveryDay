import utils.Utils;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        Utils.print(SOLUTION.validSquare(Utils.array(0,0),Utils.array(1,1),Utils.array(0,1),Utils.array(1,0)));
    }
}