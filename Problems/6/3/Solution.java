/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans=0;
    private int dfs(TreeNode node, int depth) {
        int l=0,r=0;
        if (node.left != null) {
            l=dfs(node.left, depth + 1);
        }
        if (node.right != null) {
            r=dfs(node.right, depth + 1);
        }
        if (l==0&&r==0){
            return depth;
        }
        return Math.max(l,r);
    }
    private int findNode(TreeNode node, int start){
        if (node.val==start){
            ans=Math.max(ans,dfs(node,0));
            return 1;
        }
        if (node.left!=null){
            int t=findNode(node.left,start);
            if (t!=-1){
                node.left=null;
                ans=Math.max(ans,dfs(node,0)+t);
                return t+1;
            }
        }
        if (node.right!=null){
            int t=findNode(node.right,start);
            if (t!=-1){
                node.right=null;
                ans=Math.max(ans,dfs(node,0)+t);
                return t+1;
            }
        }
        return -1;
    }
    public int amountOfTime(TreeNode root, int start) {
        findNode(root,start);
        return ans;
    }
}