import utils.Utils;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        Utils.print(SOLUTION.oddCells(2,3,Utils.array2(2,0,1,1,1)));
    }
}