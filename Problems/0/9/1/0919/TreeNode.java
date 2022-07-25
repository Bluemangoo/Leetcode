public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

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
        return "[" + this.toStringChild() + "]";
    }

    public String toStringChild() {
        StringBuilder out = new StringBuilder();
        out.append(this.val);
        if (this.left != null) {
            out.append(", ");
            out.append(this.left.toStringChild());
        }
        if (this.right != null) {
            out.append(", ");
            out.append(this.right.toStringChild());
        }
        return out.toString();
    }
}