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
    int max = Integer.MIN_VALUE;
    Queue<Pair<TreeNode, Integer>> q = new LinkedList<>();

    public int widthOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;
        return solve(root, 0);

    }

    private int solve(TreeNode root, int i) {
        if (root == null)
            return 0;
        q.offer(new Pair<>(root, 0));

        while (!q.isEmpty()) {
            int size = q.size();
            int first = 0, last = 0;
            for (int j = 0; j < size; j++) {
                Pair<TreeNode, Integer> p = q.poll();
                TreeNode k = p.getKey();
                int v = p.getValue();
                if (j == 0)
                    first = v;
                if (j == size - 1)
                    last = v;
                if (k.left != null)
                    q.offer(new Pair<>(k.left, 2 * v + 1));

                if (k.right != null)
                    q.offer(new Pair<>(k.right, 2 * v + 2));
            }
            max = Math.max(max, last - first + 1);
        }
        
        return max;
    }
}