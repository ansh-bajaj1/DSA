class Solution {

    static final long MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;

        long result = (myPow(5, even) * myPow(4, odd)) % MOD;
        return (int) result;
    }

    private long myPow(long x, long n) {
        long a = 1;
        long nn = n;

        while (nn > 0) {
            if (nn % 2 == 1) {
                a = (a * x) % MOD;
                nn = nn - 1;
            } else {
                x = (x * x) % MOD;
                nn = nn / 2;
            }
        }
        return a;
    }
}
