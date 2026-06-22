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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Deque<TreeNode> q = new ArrayDeque<>();
        if (root != null) {
            q.add(root);
        }

        while (!q.isEmpty()) {
            ArrayList<Integer> level = new ArrayList<>();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.pop();
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
                level.add(curr.val);
            }
            result.add(level);
        }
        return result;
    }
}
