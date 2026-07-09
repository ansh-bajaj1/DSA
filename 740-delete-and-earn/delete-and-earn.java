class Solution {
    int[] dp;
    public int deleteAndEarn(int[] nums) {
        int max = 0;
        for (int i : nums)
        max = Math.max(max, i);

        int[] list = new int[max + 1];

        for (int i : nums)
            list[i] += i;

        dp = new int[max + 1];
        Arrays.fill(dp, -1);

        return solve(max, list);
    }

    private int solve(int i, int[] list) {
        if (i == 0) return 0;
        if (i == 1) return list[1];

        if (dp[i] != -1) return dp[i];

        int nt = solve(i - 1, list);
        int t = list[i] + solve(i - 2, list);

        return dp[i] = Math.max(t, nt);
    }
}