import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static final List<List<Integer>> res = new ArrayList<>();

    static {
        res.add(List.of(0, 1));
        for (int i = 1; i <= 16; i++) {
            List<Integer> lastSeq = res.get(i - 1);
            int lastNum = lastSeq.get((1 << i) - 1);
            int lastNumBak = lastNum;
            int bit1 = 1;
            while (lastNum > 0) {
                lastNum >>= 1;
                bit1 <<= 1;
            }
            lastNumBak |= bit1;
            int diff = lastNumBak - lastSeq.get(0);
            int half = (1 << i);
            List<Integer> newSeq = new ArrayList<>(half << 1);
            newSeq.addAll(lastSeq);
            for (int j = 0; j < (half >> 1); j++) {
                newSeq.add(lastSeq.get(j) + diff);
            }
            diff /= 3;
            for (int j = (half >> 1); j < half; j++) {
                newSeq.add(lastSeq.get(j) + diff);
            }
            res.add(newSeq);
        }
    }

    public List<Integer> grayCode(int n) {
        return res.get(n - 1);
    }
}