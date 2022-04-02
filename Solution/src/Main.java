import utils.Utils;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
//        assert SOLUTION.strongPasswordChecker("a") == 5;
//        assert SOLUTION.strongPasswordChecker("aA1") == 3;
//        assert SOLUTION.strongPasswordChecker("1337C0d3") == 0;
        char [] ch = new char[28];
        for (int i = 0; i < 26; i++) {
            ch[i] = (char)('a' + i);
        }
        ch[26] = '.';
        ch[27] = '!';
//        for (int i = 26; i < 36; i++) {
//            ch[i] = (char)('0' + (i-26));
//        }
//        ch[36] = '.';
//        ch[37] = '!';
//        for (int i = 52; i < 62; i++) {
//            ch[i] = (char)('0' + (i-52));
//        }
//        ch[62] = '.';
//        ch[63] = '!';
//        for (int i = 0; i < 50; i++) {
//            Utils.print(Utils.randomStr(Utils.randomInt(1,50),ch));
//        }
//        Utils.print(SOLUTION.strongPasswordChecker("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
//        Utils.print(SOLUTION.strongPasswordChecker("aaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
        Utils.print(SOLUTION.strongPasswordChecker("a.a....a....aaa....a.a..a..a.a.aaa"));
    }
}