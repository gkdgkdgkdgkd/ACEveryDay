import utils.Utils;

import java.util.stream.IntStream;

public class Main {
    private static final Solution SOLUTION = new Solution();
    public static void main(String[] args){
        int a = 2;
        int[] b = Utils.array(1,2);
        Utils.print(a);
        Utils.print(b);
        Utils.print(SOLUTION.superPow(a,b));
    }
}