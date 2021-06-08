import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        System.out.println(solution.lastStoneWeightII(new int[]{31,26,33,21,40}));
        System.out.println(solution.lastStoneWeightII(new int[]{2,7,4,1,8,1}));
        System.out.println(solution.lastStoneWeightII(new int[]{1,2}));
        System.out.println(solution.lastStoneWeightII(new int[]{7,14,15,7,7}));
        System.out.println(solution.lastStoneWeightII(new int[]{89,23,100,93,82,98,91,85,33,95,72,98,63,46,17,91,92,72,77,79,99,96,55,72,24,98,79,93,88,92}));
        System.out.println(solution.lastStoneWeightII(new int[]{57,32,40,27,35,61}));
    }
}