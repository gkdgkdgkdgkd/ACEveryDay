import java.util.*;

public class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int l = 0;
        int[] count = new int[limit + 1];
        for (int v : people) {
            ++count[v];
        }
        for (int i = 1; i <= limit; ++i) {
            for (int j = 0; j < count[i]; ++j) {
                people[l++] = i;
            }
        }
        int res = 0;
        l = 0;
        for (int r = people.length - 1; l <= r; --r, ++res) {
            if (people[l] + people[r] <= limit) {
                ++l;
            }
        }
        return res;
    }
}