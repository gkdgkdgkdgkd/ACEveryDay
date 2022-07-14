import utils.Utils;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        WordFilter filter = new WordFilter(Utils.array("apple"));
        Utils.print(filter.f("b","e"));
    }
}