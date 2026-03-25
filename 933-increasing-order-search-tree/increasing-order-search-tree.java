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
    public TreeNode increasingBST(TreeNode root) {
        inorder(root);
        TreeNode r = new TreeNode(list.get(0));
        TreeNode d = r;
        for(int i=1;i<list.size();i++){
            d.right = new TreeNode(list.get(i));
            d=d.right;
        }
        return r;
    }
    private void inorder(TreeNode root){
        if(root==null) return ;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
}