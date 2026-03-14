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
    PriorityQueue<Integer> pq = new PriorityQueue<>();

    public int kthSmallest(TreeNode root, int k) {
        if (root == null)
            return 0;

        inorder(root, k);
        return solve(k);
    }

    private void inorder(TreeNode root, int k) {
        if (root == null)
            return;
        inorder(root.left, k);
        pq.offer(root.val);
        inorder(root.right, k);
    }

    private int solve(int k) {

        int a = -1;
        for (int i = 0; i < k; i++) {
            a = pq.poll();
        }
        return a;
    }
}