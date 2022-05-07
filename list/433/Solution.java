import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public int minMutation(String start, String end, String[] bank) {
        String[] queue = new String[20];
        int front = 0;
        int tail = 0;
        Set<String> set = new HashSet<>(List.of(bank));
        int n = set.size();
        int ALL_USED = 0;
        for (int i = 0; i < n; i++) {
            ALL_USED <<= 1;
            ALL_USED |= 1;
        }
        int used = 0;
        int res = 0;
        queue[tail++] = start;
        while (used != ALL_USED && front < tail) {
            int size = tail - front;
            boolean add = false;
            boolean finish = false;
            for (int i = 0; i < size; i++) {
                String last = queue[front++];
                for (int j = 0; j < n; ++j) {
                    if ((used & (1 << j)) != 0) {
                        continue;
                    }
                    String str = bank[j];
                    boolean diff = false;
                    for (int k = 0; k < 8; k++) {
                        if (str.charAt(k) != last.charAt(k)) {
                            if (diff) {
                                diff = false;
                                break;
                            } else {
                                diff = true;
                            }
                        }
                    }
                    if (diff) {
                        add = true;
                        if (str.equals(end)) {
                            finish = true;
                            break;
                        }
                        queue[tail++] = str;
                        used |= (1 << j);
                    }
                }
            }
            if (add) {
                ++res;
                if (finish) {
                    return res;
                }
            }
        }
        return -1;
    }
}