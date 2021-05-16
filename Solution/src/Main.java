import java.util.concurrent.CountDownLatch;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;
        left.right = new TreeNode(4);
        right.right = new TreeNode(5);
        System.out.println(new Solution().isCousins(root,4,5));
    }
}