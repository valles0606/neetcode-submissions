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
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode tmp = q.remove();
            TreeNode left = tmp.left;
            tmp.left = tmp.right;
            tmp.right = left;
            
            if (tmp.left != null) {
                q.add(tmp.left);
            }

            if (tmp.right != null) {
                q.add(tmp.right);
            }
        }
        return root;
    }
}
