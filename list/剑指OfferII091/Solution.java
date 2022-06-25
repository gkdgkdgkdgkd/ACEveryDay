public class Solution {
    public int minCost(int[][] costs) {
        int red = costs[0][0];
        int blue = costs[0][1];
        int green = costs[0][2];
        for (int i = 1, n = costs.length; i < n; i++) {
            int nextRed = costs[i][0] + Math.min(blue, green);
            int nextBlue = costs[i][1] + Math.min(red, green);
            green = costs[i][2] + Math.min(red, blue);
            red = nextRed;
            blue = nextBlue;
        }
        return Math.min(red, Math.min(blue, green));
    }
}