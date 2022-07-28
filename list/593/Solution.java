public class Solution {
    private int centerX;
    private int centerY;

    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        if (checkEqual(p1, p2) || checkEqual(p2, p3) || checkEqual(p3, p4) || checkEqual(p4, p1)) {
            return false;
        }
        centerX = p1[0] + p2[0] + p3[0] + p4[0];
        centerY = p1[1] + p2[1] + p3[1] + p4[1];
        int[][] total = {movePoint(p1), movePoint(p2), movePoint(p3), movePoint(p4)};
        return rotate90AndCheck(total[0], total) && rotate90AndCheck(total[1], total)
                && rotate90AndCheck(total[2], total) && rotate90AndCheck(total[3], total);
    }

    private boolean checkEqual(int[] p1, int[] p2) {
        return p1[0] == p2[0] && p1[1] == p2[1];
    }

    private int[] movePoint(int[] p) {
        return new int[]{p[0] * 4 - centerX, p[1] * 4 - centerY};
    }

    private boolean rotate90AndCheck(int[] p, int[][] total) {
        for (int[] t : total) {
            if (t[0] == -p[1] && t[1] == p[0]) {
                return true;
            }
        }
        return false;
    }
}