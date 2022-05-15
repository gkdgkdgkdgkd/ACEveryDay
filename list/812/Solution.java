public class Solution {
    public double largestTriangleArea(int[][] points) {
        int n = points.length;
        double res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    res = Math.max(res, area(points[i], points[j], points[k]));
                }
            }
        }
        return res;
    }

    private double area(int[] p1, int[] p2, int[] p3) {
        return 0.5 * Math.abs(p1[0] * p2[1] + p2[0] * p3[1] + p3[0] * p1[1] - p1[1] * p2[0] - p2[1] * p3[0] - p3[1] * p1[0]);
    }

}