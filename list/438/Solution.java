import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int n1 = s.length();
        int n2 = p.length();
        if(n2 > n1){
            return res;
        }
        int[] count = new int[26];
        for (char c : p.toCharArray()) {
            ++count[c - 'a'];
        }
        int l = 0;
        int r = 0;
        char[] c = s.toCharArray();
        while (r < n2) {
            --count[c[r] - 'a'];
            ++r;
        }
        --r;
        while (l <= n1 - n2) {
            int i = 0;
            while (i < 26) {
                if (count[i] != 0) {
                    break;
                }
                ++i;
            }
            if (i >= 26) {
                res.add(l);
            }
            ++count[c[l] - 'a'];
            ++l;
            ++r;
            if (r >= n1) {
                break;
            }
            --count[c[r] - 'a'];
        }
        return res;
    }
}