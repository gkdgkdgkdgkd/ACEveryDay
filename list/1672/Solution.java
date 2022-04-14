import java.util.Arrays;

public class Solution {
    public int maximumWealth(int[][] accounts) {
        return Arrays.stream(accounts).parallel().mapToInt(t->Arrays.stream(t).parallel().reduce(0,Integer::sum)).max().orElse(0);
    }
}