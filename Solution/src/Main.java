import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
    private final static Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        System.out.println(SOLUTION.hIndex(new int[]{0,0,1,1,1,3,3,3,3,5,5,6,6}));
    }

}