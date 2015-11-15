/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        else {
            TreeNode tmpl = invertTree(root.right);
            TreeNode tmpr = invertTree(root.left);
            root.left = tmpl;
            root.right = tmpr;
        }
        return root;
    }
}