import node.*;
import utils.*;

import java.math.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    private final static Solution SOLUTION = new Solution();

    public static void main(String[] args) throws Exception {
        int n = 1_000_000;
        int [] count = new int[10];
        for (int i = 0; i < n; i++) {
            ++count[SOLUTION.rand10()-1];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1) + " : "+(double)count[i]/n+" %");
        }
    }
}