class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
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

        list.add(nums[i]);
        recurse(nums, target, i, sum + nums[i], list);
        list.remove(list.size() - 1);

        recurse(nums, target, i + 1, sum, list);

    }
}