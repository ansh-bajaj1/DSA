class Solution {
    public int minCut(String s) {
        int n = s.length();
        boolean[][] pal = new boolean[n][n];

        for (int len = 1; len <= n; len++) {
            for (int i = 0; i + len - 1 < n; i++) {
                int j = i + len - 1;

                if (len == 1)
                    pal[i][j] = true;
                else if (len == 2)
                    pal[i][j] = s.charAt(i) == s.charAt(j);
                else
                    pal[i][j] = s.charAt(i) == s.charAt(j) && pal[i + 1][j - 1];
            }
        }

        Integer[] dp = new Integer[n];

        return solve(0, s, pal, dp) - 1;
    }

    int solve(int i, String s, boolean[][] pal, Integer[] dp) {
        int n = s.length();
        if (i == n)
        return 0;
        if (dp[i] != null)
        return dp[i];

        int ans = Integer.MAX_VALUE;

        for (int k = i; k < n; k++) {
            if (pal[i][k]) {
                ans = Math.min(ans,1 + solve(k + 1, s, pal, dp));
            }
        }

        return dp[i] = ans;
    }
}