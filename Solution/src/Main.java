import utils.Utils;

import java.util.Scanner;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
//        Utils.print(SOLUTION.numUniqueEmails(Utils.array("test.email+alex@leetcode.com","test.email.leet+ale@code.com")));
        Utils.print(SOLUTION.numUniqueEmails(Utils.array("test.email+alex@leetcode.com","test.email@leetcode.com")));
    }
}