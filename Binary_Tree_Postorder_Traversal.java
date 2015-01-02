//Definition for binary tree
import java.util.*;
import java.lang.*;


public class Binary_Tree_Postorder_Traversal {
	public static List<Integer> postorderTraversal(TreeNode root) {
		Stack<TreeNode> container = new Stack<>();
		//if(root == null) return new ArrayList<>();
		ArrayList<Integer> output = new ArrayList<> ();
		container.push(root);
		while(!container.empty()) {
			TreeNode i = container.pop();
			if(i != null) {
				TreeNode left = i.left;
				TreeNode right = i.right;
				if(left != null) {
					i.left = null;
					i.right = null;
					container.push(i);
					container.push(right);
					container.push(left);
				} else {
					if(right != null) {
						i.right = null;
						container.push(i);
						container.push(right);
					} else {
						output.add(i.val);
					}
				}

			} else {
				;
			}
		}
		//Recursive solution::
		/* 		output.addAll(postorderTraversal(root.left));
				output.addAll(postorderTraversal(root.right));
				output.add(root.val);  */


		return output;
	}
}