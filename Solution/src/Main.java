import java.util.*;
import java.util.stream.*;

public class Main {
    private final static Solution SOLUTION = new Solution();

    public static void main(String[] args) throws Exception {
        System.out.println(SOLUTION.networkDelayTime(new int[][]{
                {1,2,1},{2,1,3}
        },2,2));
    }
}