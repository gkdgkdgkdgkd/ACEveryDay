import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int numUniqueEmails(String[] emails) {
        int res = 0;
        Set<String> set = new HashSet<>();
        for (String str : emails) {
            int plus = str.indexOf("+");
            int at = str.indexOf("@");
            if (set.add(str.substring(0, plus == -1 || plus > at ? at : plus).replace(".", "")
                    + str.substring(at))) {
                ++res;
            }
        }
        return res;
    }
}