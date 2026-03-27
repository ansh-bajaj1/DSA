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
    int ans=0,max=Integer.MIN_VALUE;
    public int findBottomLeftValue(TreeNode root) {
        if(root==null) return 0;
       
        return dfs(root,0);

    }
    private int dfs(TreeNode root, int d){
        if(root==null) return ans;
        dfs(root.left,d+1);
        if(d>max){
            max=d;
            ans=root.val;
        }
        dfs(root.right,d+1);
        return ans;
    }
}