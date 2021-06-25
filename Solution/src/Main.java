import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
    private final static Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        System.out.println(SOLUTION.openLock(new String[]{"8887","8889","8878","8898","8788","8988","7888","9888"},"8888"));
    }

}