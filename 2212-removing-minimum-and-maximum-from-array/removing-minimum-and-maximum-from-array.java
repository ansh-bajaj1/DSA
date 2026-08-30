class Solution {
    public int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int x : nums) {
            max = Math.max(max, x);
            min = Math.min(min, x);
        }
        int n = nums.length;
        int m1 = -1, m2 = -1, m3 = -1, m4 = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] == max) {
                m1 = i + 1;
            }
            if (nums[n - i - 1] == max) {
                m2 = i + 1;
            }

            if (nums[i] == min) {
                m3 = i + 1;
            }
            if (nums[n - i - 1] == min) {
                m4 = i + 1;
            }
        }

        int a = Math.max(m1, m3);
        int b = Math.max(m2, m4);
        int c = m2 + m3;
        int d = m1 + m4;

        return Math.min(Math.min(a, b),Math.min(c, d));
    }
}