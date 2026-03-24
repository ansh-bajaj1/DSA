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
    int c = 0;
    int max = 0;
    Integer prev = null;
    List<Integer> ans = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        inorder(root);
        
        int[] arr = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i);
        }
        return arr;
    }

    private void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);

        if (prev != null && root.val == prev) {
            c++;
        } else {
            c = 1;
        }

        if (c > max) {
            max = c;
            ans.clear();
            ans.add(root.val);
        } 
        else if (c == max) {
            ans.add(root.val);
        }

        prev = root.val;
        inorder(root.right);
    }
}