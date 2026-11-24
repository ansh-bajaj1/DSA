class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int p = 1;
            int g = 0;
            int l = 1;

            for (int j = i; j < n; j++) {
                p *= nums[j];
                g = gcd(g, nums[j]);
                l = lcm(l,nums[j]);

                if (g * l == p) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int lcm(int a, int b) {
        int max = Math.max(a, b);
        while (true) {
            if (max % a == 0 && max % b == 0) {
                return max;
            }
            max++;
        }
    }
}