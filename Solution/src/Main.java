import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Solution solution = new Solution();
        System.out.println(solution.maxResult(new int[]{10,-20,40,-20,30,-40,50,-50,60,-70,80,-90,90,100,-100,40},3));
//        System.out.println(solution.maxJumps(new int[]{3,3,3,3,3},1));
    }
}