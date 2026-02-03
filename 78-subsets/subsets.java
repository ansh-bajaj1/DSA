class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        recurse(list,0,nums);
        return ans;
    }
    private void recurse(List<Integer> list, int i,int[] nums){
        if(i>=nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[i]);
        recurse(list,i+1,nums);
        list.remove(Integer.valueOf(nums[i]));
        recurse(list,i+1,nums);
    }
}