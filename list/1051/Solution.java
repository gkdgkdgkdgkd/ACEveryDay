public class Solution {
    public int heightChecker(int[] heights) {
        int[] count = new int[101];
        for (int v : heights) {
            ++count[v];
        }
        int res = 0;
        int index = 0;
        for (int i = 1; i <= 100; i++) {
            while (count[i]-- > 0) {
                if (heights[index++] != i) {
                    ++res;
                }
            }
        }
        return res;
    }
}