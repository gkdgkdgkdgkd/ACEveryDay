import java.util.*;

public class TopVotedCandidate {
    private final Map<Integer, Integer> timeMap = new HashMap<>();
    private final int[] times;
    private final int n;

    public TopVotedCandidate(int[] persons, int[] times) {
        int maxVotes = 0;
        int maxPerson = 0;
        n = times.length;
        this.times = times;
        int[] map = new int[5001];
        for (int i = 0; i < n; i++) {
            int val = ++map[persons[i]];
            if (maxVotes <= val) {
                maxVotes = val;
                maxPerson = persons[i];
            }
            timeMap.put(times[i], maxPerson);
        }
    }

    public int q(int t) {
        Integer cacheVal = timeMap.get(t);
        if (cacheVal != null) {
            return cacheVal;
        }
        int[] times = this.times;
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int m = (l + r) >> 1;
            if (times[m] < t) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        int cur = times[l];
        if (l + 1 < n) {
            if (times[l + 1] < t) {
                cur = times[l + 1];
            }
        }
        if (l - 1 >= 0) {
            if (cur > t) {
                cur = times[l - 1];
            }
        }
        return timeMap.get(cur);
    }
}