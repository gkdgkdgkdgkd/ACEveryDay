import java.util.HashMap;
import java.util.Map;

public class Solution {
    private char[] alpha;
    private final Map<String, Integer> cache = new HashMap<>();

    public int findMinStep(String board, String hand) {
        int[] map = new int[26];
        StringBuilder builder = new StringBuilder();
        for (char h : hand.toCharArray()) {
            if (++map[h - 'A'] == 1) {
                builder.append(h);
            }
        }
        alpha = builder.toString().toCharArray();
        char[] boards = board.toCharArray();
        dfs(boards, map, 0, getCount(boards), hand.length());
        int res = cache.get(board);
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    private int dfs(char[] boards, int[] map, int size, int[] totalCount, int totalChar) {
        String str = new String(boards);
        Integer val = cache.get(str);
        if (val != null) {
            return val;
        }
        if (boards.length == 0) {
            return size;
        }
        if (totalChar == 0) {
            return Integer.MAX_VALUE;
        }
        int n = boards.length;

        int temp = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (char c : alpha) {
                if (map[c - 'A'] > 0 && totalCount[c - 'A'] + map[c - 'A'] >= 3) {
                    --map[c - 'A'];
                    char[] next = addAndRemove(boards, i, c);
                    int[] nextCount = getCount(next);
                    temp = Math.min(dfs(next, map, size + 1, nextCount, totalChar - 1), temp);
                    ++map[c - 'A'];
                }
            }
        }

        for (char c : alpha) {
            if (map[c - 'A'] > 0 && totalCount[c - 'A'] + map[c - 'A'] >= 3) {
                --map[c - 'A'];
                char[] next = addAndRemove(boards, n, c);
                int[] nextCount = getCount(next);
                temp = Math.min(dfs(next, map, size + 1, nextCount, totalChar - 1), temp);
                ++map[c - 'A'];
            }
        }
        cache.put(str, temp);
        return temp;
    }

    private int[] getCount(char[] ch) {
        int[] count = new int[26];
        for (char c : ch) {
            ++count[c - 'A'];
        }
        return count;
    }

    private char[] addAndRemove(char[] origin, int index, char c) {
        int n = origin.length;
        if (n == 0) {
            return origin;
        }
        StringBuilder builder = new StringBuilder();
        if (c == ' ') {
            int startIndex = 0;
            int count = 1;
            char cur = origin[0];
            for (int i = 1; i < n; i++) {
                if (origin[i] == cur) {
                    ++count;
                } else {
                    if (count >= 3) {
                        break;
                    }
                    cur = origin[i];
                    startIndex = i;
                    count = 1;
                }
            }
            if (count >= 3) {
                builder.append(origin, 0, startIndex);
                builder.append(origin, startIndex + count, n - startIndex - count);
                return addAndRemove(builder.toString().toCharArray(), 0, ' ');
            }
            return origin;
        } else {
            int count = 0;
            for (int i = index; i < n; i++) {
                if (origin[i] == c) {
                    ++count;
                } else {
                    break;
                }
            }
            for (int i = index - 1; i >= 0; --i) {
                if (origin[i] == c) {
                    ++count;
                    --index;
                } else {
                    break;
                }
            }
            if (count <= 1) {
                builder.append(origin, 0, index);
                builder.append(c);
                builder.append(origin, index, n - index);
                return builder.toString().toCharArray();
            } else {
                builder.append(origin, 0, index);
                if (index + count < n) {
                    builder.append(origin, index + count, n - index - count);
                }
                return addAndRemove(builder.toString().toCharArray(), 0, ' ');
            }
        }
    }
}