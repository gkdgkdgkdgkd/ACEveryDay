import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        System.out.println(solution.numSquares(12));
        System.out.println(solution.numSquares(13));
        System.out.println(solution.numSquares(1));
        System.out.println(solution.numSquares(2));
        System.out.println(solution.numSquares(3));
        System.out.println(solution.numSquares(4));
        System.out.println(solution.numSquares(99));
        System.out.println(solution.numSquares(6347));
    }
}