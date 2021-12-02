public class Solution {
    public String[] findRelativeRanks(int[] score) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int v : score) {
            if (v > max) {
                max = v;
            }
            if (v < min) {
                min = v;
            }
        }
        int[] sort = new int[max - min + 1];
        int n = score.length;
        for (int i = 0; i < n; i++) {
            sort[score[i] - min] = i + 1;
        }
        String[] res = new String[n];
        int cur = 1;
        for (int i = max - min; i >= 0; --i) {
            int index = sort[i] - 1;
            if (index != -1) {
                if (cur == 1) {
                    res[index] = "Gold Medal";
                } else if (cur == 2) {
                    res[index] = "Silver Medal";
                } else if (cur == 3) {
                    res[index] = "Bronze Medal";
                } else {
                    res[index] = String.valueOf(cur);
                }
                ++cur;
            }
        }
        return res;
    }
}