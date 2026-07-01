class Solution {
    public int longestStrChain(String[] words) {

        Arrays.sort(words, (a, b) -> a.length() - b.length());

        Integer[][] dp = new Integer[words.length][words.length + 1];

        return solve(0, -1, words, dp);
    }

    public int solve(int i, int p, String[] words, Integer[][] dp) {

        if (i == words.length)
            return 0;

        if (dp[i][p + 1] != null)
            return dp[i][p + 1];

        int notTake = solve(i + 1, p, words, dp);

        int take = 0;
        if (p == -1 || compare(words[i], words[p])) {
            take = 1 + solve(i + 1, i, words, dp);
        }

        return dp[i][p + 1] = Math.max(take, notTake);
    }

    private boolean compare(String s1, String s2) {

        if (s1.length() != s2.length() + 1)
            return false;

        int i = 0;
        int j = 0;

        while (i < s1.length()) {
            if (j < s2.length() && s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }

        return j == s2.length();
    }
}