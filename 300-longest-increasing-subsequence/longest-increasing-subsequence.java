class Solution {
    public int lengthOfLIS(int[] nums) {
       Integer[][] dp = new Integer[nums.length][nums.length + 1];

        return solve(0, -1, nums, dp);
    }

    public int solve(int i, int p, int[] nums, Integer[][] dp) {

        if (i == nums.length) return 0;
        if (dp[i][p + 1] != null) return dp[i][p + 1];

        int n = solve(i + 1, p, nums, dp);

        int t = 0;
        if (p == -1 || nums[i] > nums[p]) {
            t = 1 + solve(i + 1, i, nums, dp);
        }

        return dp[i][p + 1] = Math.max(t, n);
    }
}