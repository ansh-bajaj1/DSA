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
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> ans = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root==null) return list;
        targetSum-=root.val;
        ans.add(root.val);
        if(root.left==null && root.right==null){
        if(targetSum==0){
            list.add(new ArrayList<>(ans));
        }
        }
        pathSum(root.left,targetSum);
        pathSum(root.right,targetSum);
        ans.remove(ans.size() - 1);
        
        return list;
    }
}