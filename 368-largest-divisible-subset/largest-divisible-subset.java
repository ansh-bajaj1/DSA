class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int[] dp = new int[n];
        int[] p = new int[n];

        Arrays.fill(dp, 1);
        int max = 1;
        int last = 0;

        for (int i = 0; i < n; i++) {
            p[i] = i;
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    p[i] = j;
                }
            }

            if (dp[i] > max) {
            max = dp[i];
            last = i;
                }
        }
        List<Integer> ans = new ArrayList<>();

        while (p[last] != last) {
            ans.add(nums[last]);
            last = p[last];
        }
        ans.add(nums[last]);
        Collections.reverse(ans);

        return ans;
    }
}