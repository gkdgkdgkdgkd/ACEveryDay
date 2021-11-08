import utils.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) throws Exception {
        String a = Utils.randomDigitStr(1000);
        String b = Utils.randomDigitStr(1000);
        Utils.print(a);
        Utils.print(b);
    }
}