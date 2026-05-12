class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        Map<String, Integer> dp = new HashMap<>();
        return solve(nums, 0, 0, target, dp);
    }

    private int solve(int[] nums, int i, int sum, int target, Map<String, Integer> dp) {
        if (i == nums.length) {
            return sum == target ? 1 : 0;
        }

        String key = i + "," + sum;
        if (dp.containsKey(key)) return dp.get(key);

        int p = solve(nums, i + 1, sum + nums[i], target, dp);
        int m = solve(nums, i + 1, sum - nums[i], target, dp);

        dp.put(key, p + m);
        return dp.get(key);
    }
}