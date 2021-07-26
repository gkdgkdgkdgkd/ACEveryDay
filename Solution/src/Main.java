import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    private final static Solution SOLUTION = new Solution();

    public static void main(String[] args) throws Exception {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(8);
        root.right = new TreeNode(5);
//        root.right.left = new TreeNode(5);
//        root.right.right = new TreeNode(7);

        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(5);
        root1.right.left = new TreeNode(5);
        root1.right.right = new TreeNode(7);
        System.out.println(SOLUTION.findSecondMinimumValue(root1));
    }
}