class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] memo = new int[amount + 1];
        Arrays.fill(memo, -2);
        return helper(coins, amount, memo);
    }
    public int helper(int[] coins, int amount, int[] memo) {

        if (amount < 0) return -1;
        if (amount == 0) return 0;

        if (memo[amount] != -2) return memo[amount];

        int min = Integer.MAX_VALUE;

        for (int coin : coins) {
            int a = helper(coins, amount - coin, memo);

            if (a >= 0) {
                min = Math.min(min, 1 + a);
            }
        }

        memo[amount] = (min == Integer.MAX_VALUE) ? -1 : min;
        return memo[amount];
    }
}