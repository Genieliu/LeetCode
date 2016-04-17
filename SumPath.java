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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) 
        	return false;
        else if(root.left == null && root.right == null){
        	return root.val == sum ? true:false;
        }
        else{
        	int remain = sum - root.val;
        	return hasPathSum(root.left,remain) || hasPathSum(root.right,remain);
        }
    }
}