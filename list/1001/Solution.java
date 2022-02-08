import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public int[] gridIllumination(int n, int[][] lamps, int[][] queries) {
        Map<Integer, Integer> row = new HashMap<>();
        Map<Integer, Integer> col = new HashMap<>();
        Map<Integer, Integer> diagonal = new HashMap<>();
        Map<Integer, Integer> antiDiagonal = new HashMap<>();
        Set<Long> points = new HashSet<>();
        for (int[] lamp : lamps) {
            if (!points.add(hash(lamp[0], lamp[1]))) {
                continue;
            }
            row.put(lamp[0], row.getOrDefault(lamp[0], 0) + 1);
            col.put(lamp[1], col.getOrDefault(lamp[1], 0) + 1);
            diagonal.put(lamp[0] - lamp[1], diagonal.getOrDefault(lamp[0] - lamp[1], 0) + 1);
            antiDiagonal.put(lamp[0] + lamp[1], antiDiagonal.getOrDefault(lamp[0] + lamp[1], 0) + 1);
        }

        int len = queries.length;
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            int r = queries[i][0];
            int c = queries[i][1];

            if (row.getOrDefault(r, 0) > 0 || col.getOrDefault(c, 0) > 0 ||
                    diagonal.getOrDefault(r - c, 0) > 0 || antiDiagonal.getOrDefault(r + c, 0) > 0
            ) {
                res[i] = 1;

                for (int x = r - 1; x <= r + 1; ++x) {
                    for (int y = c - 1; y <= c + 1; ++y) {
                        if (x < 0 || x >= n || y < 0 || y >= n) {
                            continue;
                        }
                        if (points.remove(hash(x, y))) {
                            int rowNum = row.get(x);
                            if (rowNum == 1) {
                                row.remove(x);
                            } else {
                                row.put(x, rowNum - 1);
                            }

                            int colNum = col.get(y);
                            if (colNum == 1) {
                                col.remove(y);
                            } else {
                                col.put(y, colNum - 1);
                            }

                            int diagonalNum = diagonal.get(x - y);
                            if (diagonalNum == 1) {
                                diagonal.remove(x - y);
                            } else {
                                diagonal.put(x - y, diagonalNum - 1);
                            }

                            int antiDiagonalNum = antiDiagonal.get(x + y);
                            if (antiDiagonalNum == 1) {
                                antiDiagonal.remove(x + y);
                            } else {
                                antiDiagonal.put(x + y, antiDiagonalNum - 1);
                            }
                        }
                    }
                }
            }
        }
        return res;
    }

    private static long hash(int x, int y) {
        return (long) x + ((long) y << 32);
    }
}