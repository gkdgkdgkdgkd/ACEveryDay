import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Codec {
    public String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }

        StringBuilder builder = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();

            if (temp == null) {
                builder.append("null,");
            } else {
                builder.append(temp.val).append(",");
                queue.add(temp.left);
                queue.add(temp.right);
            }
        }
        return "[" + builder.substring(0, builder.length() - 1) + "]";
    }

    public TreeNode deserialize(String data) {
        int len = data.length();
        if (len == 0) {
            return null;
        }
        String[] strs = data.substring(1, len - 1).split(",");
        int n = strs.length;
        if (strs[0].charAt(0) == 'n') {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(strs[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        for (int i = 1; i < n; ) {
            TreeNode temp = queue.poll();
            if (temp != null) {
                TreeNode left = (strs[i].charAt(0) == 'n' ? null : new TreeNode(Integer.parseInt(strs[i])));
                TreeNode right = (strs[i + 1].charAt(0) == 'n' ? null : new TreeNode(Integer.parseInt(strs[i + 1])));
                temp.left = left;
                temp.right = right;
                queue.add(left);
                queue.add(right);
                i += 2;
            } else {
                while (queue.peek() == null) {
                    queue.poll();
                }
            }
        }
        return root;
    }
}