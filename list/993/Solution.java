
public class Solution {
    private int xParent;
    private boolean findX = false;
    private int yParent;
    private boolean findY = false;

    public boolean isCousins(TreeNode root, int x, int y) {
        return heightX(root,x) == heightY(root,y) && xParent != yParent;
    }

    private int heightX(TreeNode root, int x) {
        if (root != null) {
            if (root.val == x) {
                findX = true;
                return 1;
            }
            if (root.left != null) {
                xParent = root.val;
                int temp = heightX(root.left, x);
                if (findX) {
                    return temp + 1;
                }
            }
            if (root.right != null) {
                xParent = root.val;
                int temp = heightX(root.right, x);
                if (findX) {
                    return temp + 1;
                }
            }
        }
        return 0;
    }

    private int heightY(TreeNode root, int y) {
        if (root != null) {
            if (root.val == y) {
                findY = true;
                return 1;
            }
            if (root.left != null) {
                yParent = root.val;
                int temp = heightY(root.left, y);
                if (findY) {
                    return temp + 1;
                }
            }
            if (root.right != null) {
                yParent = root.val;
                int temp = heightY(root.right, y);
                if (findY) {
                    return temp + 1;
                }
            }
        }
        return 0;
    }
}