import utils.Utils;

import java.util.Arrays;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        Utils.print(SOLUTION.findSubstring("barfoofoobarthefoobarman",Utils.array("bar","foo","the")));
//        Utils.print(SOLUTION.findSubstring("barfoothefoobarman",Utils.array("foo","bar")));
    }
}
