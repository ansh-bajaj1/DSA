class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int i : nums) sum += i;

        if (Math.abs(target) > sum) return 0;
        if ((sum + target) % 2 != 0) return 0;

        int s = (sum + target) / 2;
        Integer[][] dp = new Integer[nums.length][s + 1];

        return solve(nums.length - 1, nums, s, dp);
    }

    private int solve(int i, int[] nums, int sum, Integer[][] dp) {

        if (i == 0) {
            if (sum == 0 && nums[0] == 0) return 2;
            if (sum == 0 || sum == nums[0]) return 1;
            return 0;
        }

        if (dp[i][sum] != null) return dp[i][sum];

        int ntake = solve(i - 1, nums, sum, dp);
        int take = 0;
        if (nums[i] <= sum) {
            take = solve(i - 1, nums, sum - nums[i], dp);
        }

        return dp[i][sum] = take + ntake;
    }
}