/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.*;

public class BSTIterator {

    Stack<TreeNode> seque;

    public BSTIterator(TreeNode root) {
        seque = new Stack<>();
        if(root != null)seque.push(root);
    }

    //* @return whether we have a next smallest number
    public boolean hasNext() {
        return !seque.empty();
    }

    /** @return the next smallest number */
    public int next() {

        TreeNode x = seque.pop();
        if(x.left == null) {
            if(x.right != null) seque.push(x.right);
            return x.val;
        } else {
            seque.push(x);
            seque.push(x.left);
            x.left = null;
            return next();
        }

    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */