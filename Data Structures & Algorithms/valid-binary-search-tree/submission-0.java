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
    public boolean isValidBST(TreeNode root) {
        return isValidHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isValidHelper(TreeNode root, int left, int right) {
        if (root == null) {
            return true;
        }

        if (root.val > left && root.val < right) {
            return isValidHelper(root.left, left, root.val) && isValidHelper(root.right, root.val, right);
        } else {
            return false;
        }
        
    }
}
