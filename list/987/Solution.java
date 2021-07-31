import java.util.*;

public class Solution {
    private static final int SHIFT = 1_000;
    private static final int LEN = (SHIFT<<1) + 1;
    private int maxCol = Integer.MIN_VALUE;
    private final List[] map = new ArrayList[LEN];

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        preorder(root, 0, 0);
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i <= maxCol; i++) {
            if(map[i] != null) {
                List<Node> list = map[i];
                list.sort((v1, v2) -> {
                    if (v1.row == v2.row && v1.col == v2.col) {
                        return Integer.compare(v1.val, v2.val);
                    }
                    if(v1.row < v2.row){
                        return -1;
                    }
                    if(v1.row > v2.row){
                        return 1;
                    }
                    if(v1.col < v2.col){
                        return -1;
                    }
                    return 1;
                });
                List<Integer> v = new ArrayList<>();
                list.forEach(node-> v.add(node.val));
                res.add(v);
            }
        }
        return res;
    }

    private void preorder(TreeNode root, int row, int col) {
        if (root == null) {
            return;
        }
        int shiftCol = SHIFT + col;
        if(shiftCol > maxCol){
            maxCol = shiftCol;
        }
        if (map[shiftCol] != null){
            map[shiftCol].add(new Node(row,col, root.val));
        } else {
            List<Node> list = new ArrayList<>();
            list.add(new Node(row, col, root.val));
            map[shiftCol] = list;
        }
        preorder(root.left, row + 1, col - 1);
        preorder(root.right, row + 1, col + 1);
    }

    private static class Node {
        int row;
        int col;
        int val;

        public Node(int row, int col, int val) {
            this.row = row;
            this.col = col;
            this.val = val;
        }
    }
}