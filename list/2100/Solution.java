import java.util.List;
import java.util.ArrayList;

public class Solution {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        List<Integer> res = new ArrayList<>();
        int ascCur = time;
        int descCur = time;
        for (int i = 0, n = security.length - time; i < n; i++) {
            if (i > 0 && security[i - 1] >= security[i]) {
                --descCur;
            } else {
                descCur = time;
            }
            if (i + time - 1 > 0 && security[i + time - 1] <= security[i + time]) {
                --ascCur;
            } else {
                ascCur = time;
            }
            if (ascCur <= 0 && descCur <= 0) {
                res.add(i);
            }
        }
        return res;
    }
}