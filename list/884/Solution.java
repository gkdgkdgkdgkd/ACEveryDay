import java.util.*;

public class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] c1 = s1.split(" ");
        String[] c2 = s2.split(" ");
        Set<String> set = new HashSet<>();
        Set<String> res = new HashSet<>();

        for (String s : c1) {
            if (set.contains(s)) {
                res.remove(s);
            } else {
                res.add(s);
            }
            set.add(s);
        }

        for (String s : c2) {
            if (set.contains(s)) {
                res.remove(s);
            } else {
                res.add(s);
            }
            set.add(s);
        }

        return res.toArray(String[]::new);
    }
}