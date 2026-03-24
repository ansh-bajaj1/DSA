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
    Map<Integer,Integer> map = new HashMap<>();
    public int[] findMode(TreeNode root) {
        solve(root);
        int max = Integer.MIN_VALUE;
        int c=0;
        for(int i : map.values()){
            max=Math.max(max,i);
        }
        for(int i : map.values()){
            if(i==max) c++; 
        }
        int j=0;
        int[] arr = new int[c];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()==max){
                arr[j++]=entry.getKey();
            }
        }
        return arr;

    }
    private void solve(TreeNode root){
        if(root==null) return ;
        solve(root.left);
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        solve(root.right);
    }
}