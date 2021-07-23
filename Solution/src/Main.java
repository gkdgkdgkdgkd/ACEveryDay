import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    private final static Solution SOLUTION = new Solution();

    public static void main(String[] args) throws Exception {
        System.out.println(SOLUTION.maximumTime("2?:?0"));
        System.out.println(SOLUTION.maximumTime("0?:3?"));
        System.out.println(SOLUTION.maximumTime("1?:22"));
        System.out.println(SOLUTION.maximumTime("??:??"));
        System.out.println(SOLUTION.maximumTime("?4:?0"));
    }
}