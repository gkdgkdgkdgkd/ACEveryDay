import java.util.Arrays;

public class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        if (groupSize == 0 || n % groupSize != 0) {
            return false;
        }
        Arrays.sort(hand);
        boolean[] visit = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                for (int j = i, key = hand[i]; key < hand[i] + groupSize; j++) {
                    if (j >= n) {
                        return false;
                    }
                    if (!visit[j] && hand[j] == key) {
                        visit[j] = true;
                        ++key;
                    }
                }
            }
        }
        return true;
    }
}