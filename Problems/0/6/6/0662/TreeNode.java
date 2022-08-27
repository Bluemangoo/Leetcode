public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder("[");
        out.append(val);
        if (left != null || right != null) {
            out.append(", ");
            if (left != null) {
                out.append(left);
            } else {
                out.append("null");
            }
            out.append(", ");
            if (right != null) {
                out.append(right);
            } else {
                out.append("null");
            }
        }
        out.append("]");
        return out.toString();
    }
}