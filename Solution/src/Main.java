import utils.Utils;

import java.util.Scanner;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        Utils.print(SOLUTION.findClosest(Utils.array("I","am","a","student","from","a","university","in","a","city"),"a","student"));
    }
}