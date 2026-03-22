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
    TreeNode prev=null;
    TreeNode f=null;
    TreeNode s =null;
    public void recoverTree(TreeNode root) {
        if(root==null) return;
        in(root);
        if(f!=null && s!=null)
         swap(f,s);
        
        return;
    }
    private void in(TreeNode root){
        if(root==null) return;
        
        in(root.left);
        if(prev!=null){
        if(root.val<prev.val){
            if(f==null)
            f= prev;
            s= root;
        }}
        prev=root;
        in(root.right);
        
        return;
    }
    private void swap(TreeNode a, TreeNode b){
        int t= a.val;
        a.val=b.val;
        b.val=t;
    }
}