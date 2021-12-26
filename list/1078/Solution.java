import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] t = text.split(" ");
        List<String> res = new ArrayList<>();
        for (int i = 2, n = t.length; i < n; i++) {
            if (t[i - 2].equals(first) && t[i - 1].equals(second)) {
                res.add(t[i]);
            }
        }
        return res.toArray(new String[0]);
    }
}