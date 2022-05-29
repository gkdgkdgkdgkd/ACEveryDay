import utils.Utils;

import java.util.Scanner;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        Utils.print(SOLUTION.validIPAddress("2001:0db8:85a3:0000:0:8A2E:0370:733a"));
        Utils.print(SOLUTION.validIPAddress("255.255.255."));
    }
}