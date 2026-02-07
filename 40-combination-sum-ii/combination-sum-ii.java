class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        recurse(candidates, target, 0, 0, new ArrayList<>());
        return ans;
    }

    private void recurse(int[] nums, int target, int i, int sum, List<Integer> list) {
        if (sum == target) {
            ans.add(new ArrayList<>(list));
            return;
        }
        if (sum > target)
            return;
        if (i >= nums.length)
            return;

        for(int j=i;j<nums.length;j++){
        if(j>i && nums[j]==nums[j-1]) continue;
        list.add(nums[j]);
        recurse(nums, target, j+1, sum + nums[j], list);
        list.remove(list.size() - 1);

        }

    }
}