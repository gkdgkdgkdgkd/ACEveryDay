import node.TreeNode;
import utils.Utils;

import java.util.Arrays;

public class Main {
    private static final Solution SOLUTION = new Solution();
    public static void main(String[] args) {
        int ax1 = Utils.randomInt(-10000,5000);
        int ay1 = Utils.randomInt(-10000,5000);
        int ax2 = Utils.randomInt(ax1+1,10000);
        int ay2 = Utils.randomInt(ay1+1,10000);
        int bx1 = Utils.randomInt(-10000,5000);
        int by1 = Utils.randomInt(-10000,5000);
        int bx2 = Utils.randomInt(bx1+1,10000);
        int by2 = Utils.randomInt(by1+1,10000);
        Utils.print(ax1);
        Utils.print(ay1);
        Utils.print(ax2);
        Utils.print(ay2);
        Utils.print(bx1);
        Utils.print(by1);
        Utils.print(bx2);
        Utils.print(by2);
//        Utils.print(SOLUTION.computeArea(ax1,ay1,ax2,ay2,bx1,by1,bx2,by2));
//        Utils.print(SOLUTION.computeArea(-6,4,-4,4,3,-2,5,3));
        Utils.print(SOLUTION.computeArea(9,10,11,12,1,2,3,4));
    }
}