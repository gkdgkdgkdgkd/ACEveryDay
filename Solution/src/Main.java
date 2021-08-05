import java.util.*;

public class Main {
    private final static Solution SOLUTION = new Solution();

    public static void main(String[] args) throws Exception {
        System.out.println(SOLUTION.eventualSafeNodes(new int[][]{
                {},
                {0,2,3,4},
                {3},
                {4},
                {}
        }));
//        System.out.println(SOLUTION.eventualSafeNodes(new int[][]{
//                {1,2},
//                {2,3},
//                {5},
//                {0},
//                {5},
//                {},
//                {}
//        }));
    }
}