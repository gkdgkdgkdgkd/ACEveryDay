import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
    private final static Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        System.out.println(SOLUTION.maxIceCream(new int[]{1, 3, 2, 4, 1}, 7));
        System.out.println(SOLUTION.maxIceCream(new int[]{10, 6, 8, 7, 7, 8}, 5));
        System.out.println(SOLUTION.maxIceCream(new int[]{1, 6, 3, 1, 2, 5}, 20));
    }

}