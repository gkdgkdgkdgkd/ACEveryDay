import java.util.*;
import java.util.stream.*;

public class Main {
    private final static Solution SOLUTION = new Solution();

    public static void main(String[] args) throws Exception {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(6);
//        root.left.left.right = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
//        root.right.right.right = new TreeNode(1);

        TreeNode temp = new TreeNode(3);
        temp.left = new TreeNode(1);
        temp.right = new TreeNode(4);
        temp.left.left = new TreeNode(0);
        temp.left.right = new TreeNode(2);
        temp.right.left = new TreeNode(2);
        System.out.println(SOLUTION.verticalTraversal(temp));
//        System.out.print("[");
//        for (int i = 1; i <= 1000; i++) {
//            System.out.print(i);
//            System.out.print(",");
//        }
//        System.out.println("]");
    }
}