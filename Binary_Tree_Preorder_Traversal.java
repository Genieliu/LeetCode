//Definition for binary tree
import java.util.*;
import java.lang.*;


public class Binary_Tree_Preorder_Traversal {
	public static List<Integer> postorderTraversal(TreeNode root) {
		Stack<TreeNode> container = new Stack<>();
		//if(root == null) return new ArrayList<>();
		ArrayList<Integer> output = new ArrayList<> ();
		container.push(root);
		while(!container.empty()) {
			TreeNode i = container.pop();
			if(i != null) {
				output.add(i.val);
				TreeNode left = i.left;
				TreeNode right = i.right;
				container.push(right);
				container.push(left);
			}

		}
		//Recursive solution::
		/* output.add(root.val);
		output.addAll(postorderTraversal(root.left));
		output.addAll(postorderTraversal(root.right)); */



		return output;
	}
}