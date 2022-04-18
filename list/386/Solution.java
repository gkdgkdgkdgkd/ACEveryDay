import java.util.*;

public class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0, j = 1; i < n; i++) {
            res.add(j);
            if (j * 10 <= n) {
                j *= 10;
            } else {
                while (j % 10 == 9 || j + 1 > n) {
                    j /= 10;
                }
                ++j;
            }
        }
        return res;
    }
}