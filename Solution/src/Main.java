import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        System.out.println(solution.largestNumber(new int[]{4,3,2,5,6,7,2,5,5},9));
        System.out.println(solution.largestNumber(new int[]{7,6,5,5,5,6,8,7,8},12));
        System.out.println(solution.largestNumber(new int[]{2,4,6,2,4,6,4,4,4},5));
        System.out.println(solution.largestNumber(new int[]{6,10,15,40,40,40,40,40,40},47));
        System.out.println(solution.largestNumber(new int[]{2,4,6,2,4,6,4,4,4},5));
    }
}