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
    List<Integer> list = new ArrayList<>();
    int prev=list.size();
    public List<Integer> rightSideView(TreeNode root) {
       
        return solve(root,0);
    }
    private List<Integer> solve(TreeNode root,int n){
         if(root==null) return list;
         if(n==list.size())
      
        list.add(root.val);
       solve(root.right,n+1);
       solve(root.left,n+1);

       
        return list;
    }
}