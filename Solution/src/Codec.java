import node.TreeNode;

public class Codec {
    public String serialize(TreeNode root) {
        StringBuilder builder = new StringBuilder();
        serialize(root, builder);
        return builder.toString();
    }

    private void serialize(TreeNode root, StringBuilder builder) {
        if (root == null) {
            return;
        }
        builder.append((char) root.val);
        serialize(root.left, builder);
        serialize(root.right, builder);
    }

    public TreeNode deserialize(String data) {
        return deserialize(0, data.length() - 1, data);
    }

    private TreeNode deserialize(int l, int r, String data) {
        if (l > r) {
            return null;
        }
        int v = data.charAt(l);
        TreeNode root = new TreeNode(v);
        int m = l;
        while (m < r && data.charAt(m + 1) < v) {
            ++m;
        }
        root.left = deserialize(l + 1, m, data);
        root.right = deserialize(m + 1, r, data);
        return root;
    }
}
