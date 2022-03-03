import utils.Utils;

import java.util.stream.IntStream;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        IntStream.rangeClosed(1,100).forEach(i->Utils.print("i is "+i+" res is "+SOLUTION.addDigits(i)+" and i%9 is "+(i%9)));
    }
}