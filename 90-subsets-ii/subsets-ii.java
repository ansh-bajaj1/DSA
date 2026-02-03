class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
       List<Integer> list = new ArrayList<>();
        recurse(list,0,nums);
        return ans;
    }
    private void recurse(List<Integer> list, int i,int[] nums){
        ans.add(new ArrayList<>(list));

        for(int j=i;j<nums.length;j++){
        if(j>i && nums[j]==nums[j-1]) continue;
        list.add(nums[j]);
        recurse(list,j+1,nums);
        list.remove(list.size()-1);
        }
    }
}