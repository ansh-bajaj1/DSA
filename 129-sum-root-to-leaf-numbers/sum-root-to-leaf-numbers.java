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
    int sum = 0;
    public int sumNumbers(TreeNode root) {
        helper(root, 0);
        return sum;
    }

    void helper(TreeNode node, int a) {
        if (node == null) return;
        a = a * 10 + node.val;
        if (node.left == null && node.right == null) {
            sum += a;
        }
        helper(node.left, a);
        helper(node.right, a);
    }
}