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
    int max = 0;

    public int maxSumBST(TreeNode root) {
        solve(root);
        return max;
    }

    private int[] solve(TreeNode root) {
        if (root == null) {
            return new int[]{1, Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
        }

        int[] left = solve(root.left);
        int[] right = solve(root.right);
        if (left[0] == 1 && right[0] == 1 &&
            root.val > left[2] && root.val < right[1]) {

            int sum = left[3] + right[3] + root.val;

            max = Math.max(max, sum);

            int min = Math.min(root.val, left[1]);
            int maxVal = Math.max(root.val, right[2]);

            return new int[]{1, min, maxVal, sum};
        }

        return new int[]{0, 0, 0, 0};
    }
}