import java.util.Arrays;

public class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0]);
        int max = 0;
        int res = 0;
        for (int[] p : properties) {
            if (p[1] < max) {
                ++res;
            } else {
                max = p[1];
            }
        }
        return res;
    }
}