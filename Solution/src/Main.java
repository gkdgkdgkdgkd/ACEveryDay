import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
    private final static Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        System.out.println(SOLUTION.displayTable(List.of(
                List.of("David", "3", "Ceviche"),
                List.of("Corina", "10", "Beef Burrito"),
                List.of("David", "3", "Fried Chicken"),
                List.of("Carla", "5", "Water"),
                List.of("Carla", "5", "Ceviche"),
                List.of("Rous", "3", "Ceviche")
        )));
    }

}