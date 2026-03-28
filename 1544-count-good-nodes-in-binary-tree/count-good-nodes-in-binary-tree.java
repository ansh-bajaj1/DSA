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
    int count = 0;

    public int goodNodes(TreeNode root) {
        inorder(root, Integer.MIN_VALUE);
        return count;
    }

    private void inorder(TreeNode node, int maxSoFar) {
        if (node == null) return;

        if (node.val >= maxSoFar) {
            count++;
        }

        maxSoFar = Math.max(maxSoFar, node.val);

        inorder(node.left, maxSoFar);
        inorder(node.right, maxSoFar);
    }
}