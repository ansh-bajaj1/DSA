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
    List<List<Integer>> ans = new ArrayList<>();
    TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        solve(root, 0, 0);

        for (TreeMap<Integer, PriorityQueue<Integer>> ys : map.values()) {
            List<Integer> list = new ArrayList<>();

            for (PriorityQueue<Integer> pq : ys.values()) {
                while (!pq.isEmpty()) {
                    list.add(pq.poll());
                }
            }

            ans.add(list);
        }

        return ans;
    }

    private void solve(TreeNode root, int x, int y) {
        if (root == null) return;

        map.putIfAbsent(x, new TreeMap<>());
        map.get(x).putIfAbsent(y, new PriorityQueue<>());
        map.get(x).get(y).offer(root.val);

        solve(root.left, x - 1, y + 1);
        solve(root.right, x + 1, y + 1);
    }
}