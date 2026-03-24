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
    int min=Integer.MAX_VALUE;
    List<Integer> list = new ArrayList<>();
    public int minDiffInBST(TreeNode root) {
        if(root==null) return 0;
        solve(root);
        for (int i = 0; i < list.size() - 1; i++){
            min=Math.min(min,Math.abs(list.get(i)-list.get(i+1)));
        }
        return min;
        
    }
    private void solve(TreeNode root){
         if(root==null) return ;
        solve(root.left);
        list.add(root.val);
        solve(root.right);
    }
}