import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Solution solution = new Solution();
        System.out.println(solution.isMatch("aaab","a*"));
//        System.out.println(solution.maxJumps(new int[]{3,3,3,3,3},1));
    }
}